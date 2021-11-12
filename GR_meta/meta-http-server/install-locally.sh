#!/bin/bash
version="0.1"
file="target/min-http-server-${version}.jar"
groupId="com.olexyn.min.http.server"
artifactId="min-http-server"



mvn package
mvn install:install-file -Dfile=${file} -DgroupId=${groupId} -DartifactId=${artifactId} -Dversion=${version} -Dpackaging=jar -DgeneratePom=true
