shopt -s expand_aliases
export CLASSPATH="/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.7.2-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
cd out/production/proyecto
grun Python3 file_input ../../../input/$1 -gui