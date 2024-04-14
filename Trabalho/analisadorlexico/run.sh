#!/bin/bash
cd src/main/java
javac com/humbertosampaio/Main.java
java com.humbertosampaio.Main "$1"
read