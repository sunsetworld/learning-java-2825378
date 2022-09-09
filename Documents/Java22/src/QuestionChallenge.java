import java.util.Scanner;

public class QuestionChallenge {
    public static void main(String[] args) {

        String question = "What colour is the moon?";
        String choice1 = "grey";
        String choice2 = "blue";
        String choice3 = "green";

        String correctAnswer = choice1;
        String userAnswer;


        boolean isRunning = true;

        while (isRunning){

            System.out.println(question); // Prints the question to the user.
            System.out.println("What do you think the correct answer is? Type in the correct answer.");
            System.out.println("Choice 1: " + choice1); //
            System.out.println("Choice 2: " + choice2); // Provides the user with potential options.
            System.out.println("Choice 3: " + choice3); //
            Scanner answer = new Scanner(System.in);
            userAnswer = answer.next();

            if (userAnswer.equals(correctAnswer)){
                System.out.println("You are correct!");
                isRunning = false;
            }
            else {
                System.out.println("That's not the correct answer! Try again!");
            }

        }




    }
}
