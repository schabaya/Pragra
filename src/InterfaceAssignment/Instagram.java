package InterfaceAssignment;

public class Instagram implements SocialMedia, MobileApp {
    @Override
    public void postUpdate(String content) {
        System.out.println("Instagram: Posting picture - " + content);
    }

    @Override
    public void shareContent(String content) {
        System.out.println("Instagram: Sharing story - " + content);
    }

    @Override
    public void installApp() {
        System.out.println("Instagram: Installing app.");
    }

    @Override
    public void runApp() {
        System.out.println("Instagram: Running app.");
    }
}
