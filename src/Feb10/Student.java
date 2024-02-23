package Feb10;

public class Student {
    int stdntID;
    String name;
    //String address;
    Address address;

    public Student(int empId, String name, Address address) {
        this.stdntID = empId;
        this.name = name;
        this.address = address;
    }

    public void printStdntDetails() {
        System.out.println(stdntID);
        System.out.println(name);
        System.out.println(address);

    }
}