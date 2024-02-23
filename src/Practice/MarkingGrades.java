package Practice;

public class MarkingGrades {
    public static void main(String[] args) {
        int marks = 54;
        if (marks >= 75) {
            System.out.println("Your mark is " + marks + " and your grade is: A");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("Your mark is " + marks + " and your grade is: B");
        } else if (marks >= 50 && marks < 60)  {
            System.out.println("Your mark is " + marks + " and your grade is: C");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("Your mark is " + marks + " and your grade is: D");
        } else if (marks < 40) {
            System.out.println("Your mark is " + marks + " and your grade is: F");
        }

    }
}
