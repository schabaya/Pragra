package objectArray;

class Person {
    // Private instance variables to hold the name and age of the person
    private String name;
    private int age;

    // Constructor for the Person class
    // Initializes a new instance of Person with a name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter method for the name
    // Returns the name of the person
    public String getName() {
        return name;
    }
    // Getter method for the age
    // Returns the age of the person
    public int getAge() {
        return age;
    }
}