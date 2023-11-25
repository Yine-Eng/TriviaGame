import java.util.Scanner;
import java.io.*;

public class Main
{
   public static void main(String args[]) throws IOException
   {
        Player[] players = new Player[2];
        players[0] = new Player(1);
        players[1] = new Player(2);
        final int NUM_QUESTIONS = 10;
        int playerTurn =1;
     
        Question[] questions = new Question[NUM_QUESTIONS];
        //Initialize the array with data
        initQuestions(questions);

     for(int i = 0; i < NUM_QUESTIONS; i++)
       {
         displayQuestion(questions[i], playerTurn);

         players[playerTurn-1].chooseAnswer();
         
         if(players[playerTurn-1].getCurrentAnswer() == questions[i].getCorrectAnswerNumber())
      {
        System.out.println("Correct!\n");
        players[playerTurn-1].incrementPoints();
      }
      
      else
      {
        System.out.println("Incorrect answer. The correct answer is " + questions[i].getCorrectAnswerNumber() + ".\n");
      }
         //Switch players for the next round
         if(playerTurn ==1)
           playerTurn = 2;
         else
           playerTurn = 1;
       }
      showGameResults(players);
    }
   
   /**
      The initQuestions method uses the contents of the
      trivia.txt file to populate the qArray parameter
      with Question objects.
      @param qArray A Question array
   */
   public static void initQuestions(Question qArray[]) throws IOException
   {
      // Open the trivia.txt file.
      File file = new File("trivia.txt");
      Scanner inputFile = new Scanner(file);
      
      // Populate the qArray with data from
      // the file.
      for (int i = 0; i < qArray.length; i++)
      {
         // Create a Question object in the array.
         qArray[i] = new Question();
         
         // Get the question text from the file.
         qArray[i].setQuestion(inputFile.nextLine());
         
         // Get the possible answers.
         for (int j = 1; j <= 4; j++)
         {
            qArray[i].setPossibleAnswer(inputFile.nextLine(), j);
         }
         
         // Get the correct answer.
         qArray[i].setCorrectAnswerNumber(Integer.parseInt(inputFile.nextLine()));
      }
   }
   
   /**
      The displayQuestion method displays a question.
      @param q The question to display.
      @param playerNum The current player number.
   */
   
   public static void displayQuestion(Question q, int playerNum)
   {
      // Display the player number.
      System.out.println("Question for player #" + playerNum);
      System.out.println("------------------------");
      
      // Display the question.
      System.out.println(q.getQuestionText());
      for (int i = 1; i <= 4; i++)
      {
         System.out.println(i + ". " + q.getPossibleAnswer(i));
      }
   }
   

  
   /**
      The showGameResults method shows the game results.
      @param players The array of Player objects.
   */
   public static void showGameResults(Player[] players)
   {
     System.out.println("Here are the results for the game:");
     System.out.println("Player One had " + players[0].getPoints() + "points.");
     System.out.println("Player Two had " + players[1].getPoints() + "points.");
     if(players[0].getPoints() > players[1].getPoints())
     {
       System.out.println("Player One won!");
     }
     else if(players[0].getPoints() < players[1].getPoints())
     {
       System.out.println("Player Two won!");
     }
     else
     {
       System.out.println("Draw!");
     }
   }
}