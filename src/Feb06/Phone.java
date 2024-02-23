package Feb06;
public class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }
    public void makeCall() {
        System.out.println("Making a call...");
    }
    public String getModel() {
        return model;
    }
}
