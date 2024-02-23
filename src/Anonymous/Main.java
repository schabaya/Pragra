package Anonymous;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Greeting using an anonymous class
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, world!");
            }
        };

        // Calling the greet method of the anonymous class
        greeting.greet(); // Output: Hello, world!
    }
}