package Feb10;

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student(101, "John", new Address("110 Matheson", "Mississauga", "CA", "L2K 4W3"));
        System.out.println(student.address.postal);
    }
}