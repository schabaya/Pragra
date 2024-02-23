package Feb06;
public class Main {
    public static void main(String[] args) {
        Samsung samsungPhone = new Samsung("Galaxy S22", "Phantom Black", "Glass", true);
        samsungPhone.printDetails();
        samsungPhone.makeCall();
        samsungPhone.surfInternet();
        samsungPhone.clickPictures();
    }
}
