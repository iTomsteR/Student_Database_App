import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private final static int COURSE_COST = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter name and year of student.
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Choose student class level:\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nChoose student class level: ");
        this.gradeYear = in.nextInt();

        generateStudentID();

        courses = "";
        tuitionBalance = 0;
    }

    //Generate Student ID
    private void generateStudentID() {
        //Grade level + ID
        id++;
        studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter course ID to enroll (Enter Q when you are done): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equalsIgnoreCase("Q")) {
                courses += "\n " + course;
                tuitionBalance += COURSE_COST;
            } else break;
        } while(true);

    }

    //View balance
    public void viewBalance() {
        System.out.println("Your tuition balance is: " + tuitionBalance + "$");
    }

    //Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter the amount of payment you want to pay: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        if(tuitionBalance - payment < 0) {
            System.out.println("Thank you for your payment of: " + payment + "$");
            System.out.println("Your exchange is: " +  (payment - tuitionBalance) + "$");
            tuitionBalance = 0;
        } else {
            System.out.println("Thank you for your payment of: " + payment + "$");
            tuitionBalance -= payment;
        }
        viewBalance();
    }

    //Show status
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
