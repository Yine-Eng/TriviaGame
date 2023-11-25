# Instructions  

In this programming challenge, you will create a simple trivia game for two players. The program will work like this:


Starting with player 1, each player gets a turn at answering 5 trivia questions. (There are 10 questions, 5 for each player.) When a question is displayed, four possible answers are also displayed. Only one of the answers is correct, and if the player selects the correct answer, he or she earns a point.


After answers have been selected for all of the questions, the program displays the number of points earned by each player and declares the player with the highest number of points the winner.


You are to design a Question class to hold the data for a trivia question. The Question class should have String fields for the following data:


A trivia question
Possible answer 1
Possible answer 2
Possible answer 3
Possible answer 4
The number of the correct answer (1, 2, 3, or 4)


The Question class should have appropriate constructor(s), accessor, and mutator methods.

The program should create an array of 10 Question objects, one for each trivia question. (If you prefer, you can use an ArrayList instead of an array.) Make up your own trivia questions on the subject or subjects of your choice for the objects. An example trivia file is provided, but you should create your own.