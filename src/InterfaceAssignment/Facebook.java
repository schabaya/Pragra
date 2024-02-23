package InterfaceAssignment;

public class Facebook implements SocialMedia, Website, MobileApp {
    @Override
    public void postUpdate(String content) {

        System.out.println("Facebook: Posting update - " + content);
    }

    @Override
    public void shareContent(String content) {

        System.out.println("Facebook: Sharing content - " + content);
    }

    @Override
    public void displayWebsite() {

        System.out.println("Facebook: Displaying website.");
    }

    @Override
    public void installApp() {

        System.out.println("Facebook: Installing app.");
    }

    @Override
    public void runApp() {

        System.out.println("Facebook: Running app.");
    }
}
