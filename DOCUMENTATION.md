# The "Guess - A - Number" Game
Simple console game "Guess a Number" on Java

1. Project Title
    Inside this project is a simple game written on IntelliJ Idea (using Java).
    The name of the game is: "Guess a Number".

2. Project goals
    So the goal of our program is to make a game which anyone can play in his free time!

3. Solution
    a) Firstable the library we use is: "java.util" and we get from their: "Scanner" and "Random"!
    b) The implement of the code:
        - First we ask the player if he want to play (if he says "yes" (no case sensitive) the game starts).
        - Second he starts from level 1 and try to guess a number from 1 to 100
        - Then I did a for loop to check if the input player got is valid number (if not we ask him for another input)
        - After that we check his number and if it's higher we say: "Too High!" or lower: "Too Low!"
        - If player guesses the number before his tenth try he gets to the next level where the max number range improves with 100 (For example: Level 2 - from 1 to 200, Level 3 - 1 to 300 etc.)
        - Otherwise he losts the game and is asked if he wants to play again
    c) Source code:
        - https://pastebin.com/EhBeuNue 
