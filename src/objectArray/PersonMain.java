package objectArray;

public class PersonMain {
    public static void main(String[] args) {
        // Declare and instantiate an array of Person objects
        Person[] personArray = new Person[2];

        // Initialize the array elements
        // Create a new Person object for the first element of the array
        personArray[0] = new Person("John Doe", 30);
        // Create a new Person object for the second element of the array
        personArray[1] = new Person("Jane Doe", 25);

        // Loop through each element in the personArray
        for (Person person : personArray) {
            // Print out the name and age of the person
            // getName() and getAge() methods are used to access the person's name and age
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }
}