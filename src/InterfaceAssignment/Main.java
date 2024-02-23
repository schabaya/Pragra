package InterfaceAssignment;

public class Main {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        Instagram instagram = new Instagram();
        Snapchat snapchat = new Snapchat();
        Gmail gmail = new Gmail();


        System.out.println("=== Facebook Demo ===");
        facebook.displayWebsite();
        facebook.installApp();
        facebook.runApp();
        facebook.postUpdate("Hello World!");
        facebook.shareContent("Check this out!");


        System.out.println("\n=== Instagram Demo ===");
        instagram.installApp();
        instagram.runApp();
        instagram.postUpdate("My latest photo");
        instagram.shareContent("This story is awesome");


        System.out.println("\n=== Snapchat Demo ===");
        snapchat.installApp();
        snapchat.runApp();
        snapchat.postUpdate("Snap of the day");
        snapchat.shareContent("Funny snap");


        System.out.println("\n=== Gmail Demo ===");
        gmail.displayWebsite();
        gmail.installApp();
        gmail.runApp();
    }


}
