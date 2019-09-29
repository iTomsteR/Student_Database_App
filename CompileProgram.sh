#!/bin/sh

PROGRAM_NAME=StudentDatabaseAppApp.java

javac -d ./ ./src/*.java

if [ $? -eq 0 ]
then
    echo "Successful Compilation!"
    java StudentDatabaseApp
fi