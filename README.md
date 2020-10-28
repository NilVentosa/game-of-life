# GAME OF LIFE

This is an atempt of an implementation of Conway's Game of life in java, as a way to learn the language.

To run:
> mvn package && java -jar target/game-of-life-1.0-SNAPSHOT.jar $(( ($(tput cols) / 2) - 2 )) $(( ($(tput lines)) - 4 )) 200

