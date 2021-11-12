#! /usr/bin/python3

## only works on the data of tagblatt-junisession 2018.pdf
## The data quality of data could be improved if the word doucments would still be available

##which motion, name, text

import re
import json

motions = []
discussion = []
name=""
words=""
geschaeft=""

#TODO stillschweigende annahme noch nicht als ende einer motion

def split_name_location_party(s):
    try:
        name, party = s.split("(")
        name, location = name.split(",")
        return (name[0:-1].strip(), location.strip(), party[0:-1].strip())
    #president.
    except ValueError: return (s.strip(), "NA", "NA")

out="./out/"

year = "2020"
yes_votes = 0
no_votes = 0
enthalten_votes = 0
#id_rgx = re.compile(f"{year}\.RRGR.\d+")
id_rgx = re.compile("^Geschäft.*", re.UNICODE)
yes_rgx = re.compile("Ja.*\d$", re.UNICODE)
no_rgx = re.compile("No.*\d$", re.UNICODE)
enthalten_rgx = re.compile("Enthalten.*\d$", re.UNICODE)
#with open("./2018/Tagblatt-Junisession 2018.md") as f:

with open("./2018/Tagblatt-Novembersession 2018.md", encoding="UTF-8") as f:
    rgx = re.compile("\*\*(.*|président|präsident)\(?.*\)?\.\*\*", re.UNICODE)
    lines = f.readlines()
    for line in lines:
        m = rgx.match(line)

        if m:
            name = m[0][2:-3]
            words += line[len(name)+5:-1]
        elif name != "":
            words += line

        if id_rgx.match(line):
            geschaeft = line[len("Geschäft "):-1].strip()
            #with open(out+geschaeft, "w+") as o:
            #    json.dump(discussion, o)
            motions.append({"geschaeft": geschaeft, "discussion":discussion})
            discussion = []

        if line == "\n" and name != "":
            name, location, party = split_name_location_party(name)
            discussion.append({"name": name, "party": party, "location":location, "text": words})
            name = ""
            words = ""

        if yes_rgx.match(line):
            yes_votes = int(line[-4:-1].strip())
            print(yes_votes)

        if no_rgx.match(line):
            no_votes = int(line[-4:-1].strip())
            print(no_votes)

        if enthalten_rgx.match(line):
            enthalten_votes = int(line[-4:-1].strip())
            print(enthalten_votes)

with open("session_june_20.json", "w+", encoding="UTF-8") as o:
    json.dump(motions, o, indent=2, ensure_ascii=False)
