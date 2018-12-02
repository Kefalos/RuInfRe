# Compile main

javac -cp src:./import/gson-2.8.0.jar -d ./bin ./src/tim2015/ruinfre/app/RuInfRe.java

# Run main

java -cp ./bin:./import/gson-2.8.0.jar tim2015.ruinfre.app.RuInfRe

# Delete old logs


if ls hs* 1> /dev/null 2>&1; then
	rm hs*
fi


