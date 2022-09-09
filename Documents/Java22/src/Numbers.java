import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int numberInput;
        System.out.println("Pick a number between 1 and 10.");
        Scanner newNumber = new Scanner(System.in);
        numberInput = newNumber.nextInt();
        if (numberInput <= 5){
            System.out.println("You have good connections with friends and a healthy social life.");
        } else if (numberInput <= 10) {
            System.out.println("You have good aspirations and a chance for a great life.");
        } else {
            System.out.println("You have committed horrible sins. Pick again.");
        }
    }
}
