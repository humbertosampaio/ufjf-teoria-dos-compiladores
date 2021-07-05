#!/bin/bash

echo "Invocando antlr"
java -jar ./dependencies/antlr-4.9.2-complete.jar ./lang/parser/lang.g4

echo "Compilando as classes java..."
javac ./lang/ast/*.java
echo "Compilação dos arquivos em ./lang/ast/ concluída!" 
javac -cp .:./dependencies/antlr-4.9.2-complete.jar ./lang/parser/*.java
echo "Compilação dos arquivos em ./lang/parser/ concluída!" 
javac -cp .:./dependencies/antlr-4.9.2-complete.jar ./lang/*.java
echo "Compilação dos arquivos em ./lang/ concluída!" 
