#Exemplo para interpretar um programa:
#bash run.sh -i testes/semantica/certo/teste1.lan
#Primeiro parâmetro é a opção (teste sintático, interpretar etc)
#Segundo parâmetro é o caminho do arquivo
java -cp .:./beaver-rt-0.9.11.jar lang/LangCompiler $1 $2