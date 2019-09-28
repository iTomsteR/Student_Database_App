import java.util.Scanner;

public class StudentDatabaseApp {
    /*
    TO DO:
        1. Save courses in list
        2. Have a check for valid name, year, course, etc
        3. id should increment only if grade year is already contains given id. Example 21001 and 31001 can both be in DB.
        4. Make print statement interaction more readable and user-friendly.
     */

    public static void main(String[] args) {

        //Ask how many students we want to add.
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n number of students.
        for(int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for(int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n]);
        }

    }

}
