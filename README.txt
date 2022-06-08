
#######################################################################

Run: Compile files in terminal
		javac *.java
		java Main




There are 12 files in my assignment

10 classes + 1 abstract class(Board.java) + 1 interface (Player_Interface.java)

Main.java
Start the game by initializing a menu

Menu.java
Allow user to choose to play Tic Tac Toe or Order and Chaos or exit.

UI.java
It consists of many methods for showing the context and printing the final score board.

Input_Check.java
All methods are used to extract user's input successfully.

Board.java
An abstract class sets general board's properties and functions. For example, it can initialize and print the board, return value in certain coordinate.

TTT_Board.java + OAC_Board.java
They are extended from abstract Board. Both override winCheck for checking if it reaches the winning condition.

TTT_Logic.java
The class has only one method which is used to start TTT game, consisting of important logics to run the game.

OAC_Logic.java
This class is a close variant of TTT_logic class. It also has one method to run OAC game.

Team.java
This class sets team's properties and functions. It has an array named Player, which records all players in this team. 

Player_Interface.java
This interface is designed for future use as well as player class. It describes player's implementations.

Player.java
This class sets player's properties and functions. It can be used for creating players and record the score.


######################################################################
