package Feb06;
public class Samsung extends SmartPhone {
    private String bodyType;
    private boolean usesAI;

    public Samsung(String model, String color, String bodyType, boolean usesAI) {
        super(model, color);
        this.bodyType = bodyType;
        this.usesAI = usesAI;
    }
    public void clickPictures() {
        System.out.println("Clicking pictures...");
    }
    public String getBodyType() {
        return bodyType;
    }
    public boolean usesAI() {
        return usesAI;
    }
    public void printDetails() {
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Body Type: " + getBodyType());
        System.out.println("Uses AI: " + usesAI());
    }
}
