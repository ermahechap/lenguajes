shopt -s expand_aliases
export CLASSPATH="/home/daniel/Downloads/downlands/antlr-4.7.1-complete.jar:$CLASSPATH"
alias antlr4='java -jar /home/daniel/Downloads/downlands/antlr-4.7.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
cd out/production/proyecto

grun Python3 file_input ../../../input/input.py -gui
