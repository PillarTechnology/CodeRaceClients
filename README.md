# Pillar Code Race

Client application which connects to the Code Race server.

## Getting Started

See [Manual Instructions](https://github.com/PillarTechnology/CodeRaceClients/blob/master/ManualInstructions.md "Manual Instructions") for detailed steps for setting up Code Race, and [Automated Instructions](https://github.com/PillarTechnology/CodeRaceClients/blob/master/AutomatedInstructions.md "Automated Instructions") for the easy path.

##### Setup:
1. Download [`CodeRaceClientSetup.scpt`](https://github.com/PillarTechnology/CodeRaceClients/blob/master/Scripts/CodeRaceClientSetup.scpt "Code Race Client Setup") and open it in Script Editor (found under Utilities).
2. Compile the script (Hammer icon)
3. Run the script (Play icon)

###### The script will do the following
> 1. Install the following applications:
>    * Homebrew
>    * Git client
>    * Node.js and npm
>    * Java
>    * Gradle
> 
> 2. Store the server's IP address in a file called `SERVER_IP.txt` under the `Documents` directory.
>    * If you need to change the IP address, run the `SetServerIPAddress` script on the `Desktop`.
> 3. Register the client computer as a particular racer in a file called `RACER_ID.txt` under the `Documents` directory.
>    * If you need to change the racer id, run the `RegisterRacer` script on the `Desktop`.
> 2. Create a `coderace` directory to clone the git repository into, and a `race` directory for Karma to place test logs in.
> 3. Clone the repository.
> 4. Download Visual Studio Code.
> 5. Place shortcuts to all scripts, the `CodeRaceClients` directory, and these instructions on the `Desktop`.

##### Run:
1. Run the script that corresponds to the kata being worked on
   * ###### The script will do the following:
     > - Install any necessary dependencies.
     > - Run the `setupRace.sh` shell script with the IP address and racer id that were stored in the setup.
     > - Open the kata file in Visual Studio Code

##### Ending Race:
1. Run the `KillClientServer` script application on the `Desktop`
   ###### The script will do the following
> 1. Shut down the client session.
> 2. Quit Terminal.
> 2. Quit Visual Studio Code.

## Kata Descriptions
Brief kata descriptions are provided below for convenience, as the laptops that the kata battles are taking place on are on a private network that is not connected to the internet and the katas may have been modified slightly to facilitate their use during the code battle.  Solutions to each can be found in the kata directory.

### FizzBuzz
Given an integer, return a string of that number, except if the number is a multiple of 3, in which case return "Fizz", or if the number is a multiple of 5, in which case return "Buzz".  If a number is a multiple of both 3 and 5, then return "FizzBuzz".

### Prime Factors
Given an integer, return an ascending list of integers containing all of the prime factors of the specified integer.

### Roman Numerals
For the code battle, convert from a Roman numeral to its integer value.

(The first part of the Roman numeral kata is often to do the converse conversion, from an Arabic representation to the Roman numerals.)


