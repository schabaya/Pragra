

package InnerClass;

public class OuterClass {
    private String outerField = "Outer Class Field";

    // Inner class
    class InnerClass {
        void display() {
            // The inner class can access the outer class's members.
            System.out.println("Accessing from Inner Class: " + outerField);
        }
    }

    public void callInner() {
        // Creating an instance of the inner class
        InnerClass inner = new InnerClass();
        inner.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.callInner(); // This will invoke the display method of the inner class
    }
}