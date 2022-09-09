import java.util.Scanner;

public class NextSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat)
        {
            System.out.println("Playing song.");
            System.out.println("Play next song?");
            String userInput = input.next();

            if (userInput.equals("Yes"))
            {
                isOnRepeat = false;
            }
            else {
                isOnRepeat = true;
            }
        }
        System.out.println("Playing next song.");
    }
}
