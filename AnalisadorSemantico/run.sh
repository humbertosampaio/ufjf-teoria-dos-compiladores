java -jar lang/parser/JFlex.jar -nobak lang/parser/Lang.flex
java -jar lang/parser/beaver-cc-0.9.11.jar -T lang/parser/Lang.grammar
javac -cp .:./beaver-rt-0.9.11.jar lang/semanticanalysis/*.java
javac -cp .:./beaver-rt-0.9.11.jar lang/visitor/*.java
javac -cp .:beaver-rt-0.9.11.jar lang/LangCompiler.java
java -cp .:./beaver-rt-0.9.11.jar lang/LangCompiler $1 $2