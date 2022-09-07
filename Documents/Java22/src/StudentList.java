import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        String student1;
        Scanner studentName;
        for (int i = 0; i < 5; i = i+1){
            studentName = new Scanner(System.in);
            student1 = studentName.nextLine();
            System.out.println("Student name is: " + student1);
        }

    }
}
