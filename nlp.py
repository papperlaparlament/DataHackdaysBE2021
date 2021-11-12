__author__ = "Pierre-Alexandre Fonta"

import json
import re
import sys
from collections.abc import Iterator
from pathlib import Path


# The keyword search is currently only looking for exact matches, ignoring case.
# Looking for related keywords, like synonyms or themes, is planned for later.
# However, one could use regular expressions.
def search(texts: Iterator[str], keyword: str) -> Iterator[int]:
    regex = re.compile(f"\\b{keyword}\\b", re.IGNORECASE)
    for idx, text in enumerate(texts):
        founded = regex.findall(text)
        if founded:
            yield idx, len(founded)


def main():
    path = Path("session_nov_18.json")
    with path.open() as f:
        data = json.load(f)

    names = [y["name"] for x in data for y in x["discussion"]]
    texts = [y["text"] for x in data for y in x["discussion"]]

    print(f"(searching in {len(texts)} speeches)")

    cmd = sys.argv[1]

    # List the speeches containing a keyword.
    # Display the persons giving the speeches and the counts.
    # Rank by keyword count.
    # python nlp.py speeches <keyword> <limit>
    if cmd == "speeches":
        keyword = sys.argv[2]
        limit = int(sys.argv[3])
        matched = search(texts, keyword)
        ordered = sorted(matched, key=lambda x: x[1], reverse=True)
        if not ordered:
            print("-- no results --")
        for idx, count in ordered[:limit]:
            name = names[idx]
            text = texts[idx]
            print(name, f"{count} mention(s)", text, sep="  |  ")
        sys.exit(0)

    # List the persons giving a speech containing a keyword.
    # Display the speech and keyword counts.
    # Rank by speech and keyword counts.
    # python nlp.py persons <keyword>
    if cmd == "persons":
        print("-- not implemented yet --")
        sys.exit(0)

    # Give statistics according to a dimension about the persons giving a speech containing a keyword.
    # Display speech and keyword counts for the dimension (party, gender, age, ...).
    # Rank by speech and keyword counts.
    # python nlp.py statistics <dimension> <keyword>
    if cmd == "statistics":
        print("-- not implemented yet --")
        sys.exit(0)

    # Summarize speeches given by person per motion.
    # Display the list of mentions and their summary.
    # Rank in chronological order.
    # python nlp.py summaries <person>
    if cmd == "summaries":
        print("-- not implemented yet --")
        sys.exit(0)

    print("-- unrecognized command --")


if __name__ == "__main__":
    main()
