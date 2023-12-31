/**
   The Question class stores data about a trivia question
   for the Trivia Game programming challenge.
*/

public class Question
{
   // Constant for the number of questions
    public final int NUM_QUESTIONS = 10;
   
   // The trivia question
   private String questionText;

   // An array to hold possible answers.
   private String possibleAnswer[] = new String[NUM_QUESTIONS];


   // The number (1, 2, 3, or 4) of the
   // correct answer.
  private int correctAnswer;

   /**
      No-arg constructor
   */
   public Question()
   {
      questionText = "";
      correctAnswer = 0;
      for (int i = 1; i < NUM_QUESTIONS; i++)
          setPossibleAnswer("", i);
   }
   
   /**
      setQuestion method
      @param question The question text.
   */
   public void setQuestion(String question)
   {
      questionText = question;
   }
   
   /**
      setPossibleAnswer method
      @param text The answer text.
      @param num The answer num.
   */
   public void setPossibleAnswer(String text, int num)
   {
      possibleAnswer[num] = text;

   }
   /**
      setCorrectAnswerNum method
      @param num The correct answer number.
   */
   public void setCorrectAnswerNumber(int num)
   {
      correctAnswer = num;
   }
   
   /**
      The getQuestionText method returns this object's
      question text.
      @return This object's question text.
   */
   public String getQuestionText()
   {
      return questionText;
   }
   
   /**
      The getPossibleAnswer method returns one of the
      possible answers to this object's question.
      @param num The answer number.
      @return The possible answer specified by num.
   */
   public String getPossibleAnswer(int num)
   {
      return possibleAnswer[num];
   }
   
   /**
      getCorrectAnswerNumber method
      @return The number of the correct answer.
   */
   public int getCorrectAnswerNumber()
   {
      return correctAnswer;
   }
   
   /**
      getCorrectAnswser method
      @returns the correct answer.
   */
   public String getCorrectAnswer()
   {
      return possibleAnswer[correctAnswer+1];
   }
}