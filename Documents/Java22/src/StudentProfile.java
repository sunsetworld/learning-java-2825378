import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {

        String studentFirstName = "Sam";
        String studentLastName = "Cox";
        String studentFullName = studentFirstName + " " + studentLastName;
        // Gets the students full name by adding together the first and last names.

        int studentAge = 19;
        double averageGCSE = 3.5;
        // Gets the students age and academic info.

        int nameIndex = 0;
        char firstName = studentFirstName.charAt(nameIndex);
        char lastName = studentLastName.charAt(nameIndex);
        // Retrieves the students initials by grabbing the first word of the students first and last names.

        boolean perfectAttendance = true;
        // Sets the bool for perfect attendance.

        System.out.println("Information for student " + studentFullName + ":");
        System.out.println("Student age: " + studentAge);
        System.out.println("Perfect Attendance: " + perfectAttendance);
        System.out.println("Average GCSE: " + averageGCSE);
        System.out.println("What do you want to update the GCSE grade to?");
        Scanner newGCSE = new Scanner(System.in); // Retrieves input from the console.
        averageGCSE = newGCSE.nextDouble(); // Sets the averageGCSE var to the new input by converting it to a double
        // and setting it from the newGCSE return value.
        System.out.println("The new average GCSE for " + studentFullName + ": " + averageGCSE);






    }
}
