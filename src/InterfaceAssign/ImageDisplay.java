package InterfaceAssign;

class ImageDisplay extends MediaDevice {
   String imageName;
   String resolution;

    public ImageDisplay(String name, String imageName, String resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    public void displayImage() {
        System.out.println("Displaying image: " + imageName + " with resolution " + resolution);
    }

    void displayDetails() {
        System.out.println("\nImage Display Name: " + name + ", Image: " + imageName + ", Resolution: " + resolution);
    }
}