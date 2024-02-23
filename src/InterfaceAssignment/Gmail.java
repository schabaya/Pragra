package InterfaceAssignment;

public class Gmail implements Website, MobileApp {
    @Override
    public void displayWebsite() {
        System.out.println("Gmail: Displaying website.");
    }

    @Override
    public void installApp() {
        System.out.println("Gmail: Installing app.");
    }

    @Override
    public void runApp() {
        System.out.println("Gmail: Running app.");
    }
}
