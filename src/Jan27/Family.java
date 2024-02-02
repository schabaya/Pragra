package Jan27;

public class Family {

    String firstName;
    static String lastName = "Jones";
    int age;
    int houseNumber;

    public Family(String firstName, int age, int houseNumber) {
        this.firstName = firstName;
        this.age = age;
        this.houseNumber = houseNumber;
    }

    public void printFamily(){
        System.out.println("Family details : "+ firstName + " "+ lastName + " "+ age + " " + houseNumber);
    }
    public static void main(String[] args) {
        Family family1 = new Family("Shadreck", 22,22224 );
        Family family2 = new Family("Shadrecka", 20,22225 );
        Family family3 = new Family("Shadreckb", 21,22226 );
        Family family4 = new Family("Shadreckc", 23,22227 );

        family1.printFamily();
        family2.printFamily();
        family3.printFamily();
        family4.printFamily();
    }
}
