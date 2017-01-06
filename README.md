# CodeRace Starter Katas
Files for CodeRace Kata Battles

## Setup
0. You might need these commands:

```sh
npm install -g karma-jasmine
npm install -g karma-phantomjs-launcher
```
install gradle

1. Edit `raceProgressPoster.js` to use the correct IP address.

```sh
npm install
npm install -g karma
mkdir -p ~/race
```

## Kata Descriptions
Brief kata descriptions are provided below for convenience, as the laptops that the kata battles are taking place on are on a private network that is not connected to the internet and the katas may have been modified slightly to facilitate their use during the code battle.

### FizzBuzz
Given an integer, return a string of that number, except if the number is a multiple of 3, in which case return "Fizz", or if the number is a multiple of 5, in which case return "Buzz".  If a number is a multiple of both 3 and 5, then return "FizzBuzz".

### Prime Factors
Given an integer, return an ascending list of integers containing all of the prime factors of the specified integer.

### Roman Numerals
For the code battle, convert from a Roman numeral to its integer value.

(The first part of the Roman numeral kata is often to do the converse conversion, from an Arabic representation to the Roman numerals.)

## Example files that the player/racer needs to know about:
Java Kata:

Test Code for racer to TDD in:
CodeRace/raceClient/KataBattles/romanNumeralsJava/src/test/java/com/coderace/RomanNumeralsTest.java

Implementation code for racer to develop in:
CodeRace/raceClient/KataBattles/romanNumeralsJava/src/main/java/com/coderace/RomanNumerals.java


Javascript Kata:

Implementation code for racer to develop in:
CodeRace/raceClient/KataBattles/RomanNumeralsJS/src/RomanNumerals.js

Test Code for racer to TDD in:
CodeRace/raceClient/KataBattles/RomanNumeralsJS/spec/RomanNumeralsSpec.js


## Example files that are OFF-LIMITS to the player/racer:
Java Kata:
OFF LIMITS - Code used by test runner to run values 1-100
CodeRace/raceClient/KataBattles/fizzBuzzJava/src/test/groovy/com/coderace/accept/FizzBuzzAcceptTest.groovy

Javascript kata:
OFF LIMITS - Code used by test runner to run values 1-10
CodeRace/raceClient/KataBattles/RomanNumeralsJS/spec/accept/RomanNumeralsSpec.js


