package Feb06;
public class SmartPhone extends Phone {
    private String color;

    public SmartPhone(String model, String color) {
        super(model);
        this.color = color;
    }
    public void surfInternet() {
        System.out.println("Surfing the Internet...");
    }
    public String getColor() {
        return color;
    }
}
