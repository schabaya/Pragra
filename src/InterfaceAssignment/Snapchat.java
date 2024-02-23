package InterfaceAssignment;

public class Snapchat implements SocialMedia, MobileApp {
    @Override
    public void postUpdate(String content) {
        System.out.println("Snapchat: Posting snap - " + content);
    }

    @Override
    public void shareContent(String content) {
        System.out.println("Snapchat: Sharing snap - " + content);
    }

    @Override
    public void installApp() {
        System.out.println("Snapchat: Installing app.");
    }

    @Override
    public void runApp() {
        System.out.println("Snapchat: Running app.");
    }
}
