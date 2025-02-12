import java.util.*; 

class Question
{
    String question;
    String[] options;
    char correctAnswer;

    public Question(String question, String[] options, char correctAnswer)
    {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(char answer)
    {
        return Character.toUpperCase(answer) == correctAnswer;
    }

}
public class Quiz 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Question[] quiz = {
        new Question("Which animal is known as the 'Ship of the Desert?", new String[]{"A) Camel", "B) Elephant", "C) Leopard", "D) Dog"}, 'A'),
        new Question("How many days are there in a week?", new String[]{"A) 10", "B) 12", "C) 7", "D) 30"}, 'C'),
        new Question("How many sides are there in Triangle?", new String[]{"A) 4", "B) 3", "C) 2", "D) 5"}, 'B')
        };

        int score = 0;

        for(int i = 0; i<quiz.length; i++)
        {
            System.out.println("\nQuestions "+ (i+1)+ ": "+ quiz[i].question);
            for(String option: quiz[i].options)
            {
                System.out.println(option);
            }

            System.out.println("Enter your options A,B,C,D: ");
            char answer = sc.next().charAt(0);

            if(quiz[i].checkAnswer(answer))
            {
                System.out.println("Correct! ");
                score++;
            }
            else
            {
                System.out.println("Wrong answer. The correct answer is: " + quiz[i].correctAnswer);
            }
        }
        System.out.println("End of Quiz!!! \n Your total score: "+ score+"/"+quiz.length);
        sc.close();
        

        
    }
    
  
}
    

