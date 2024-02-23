package InterfaceAssign;

abstract class MediaDevice {
    String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    abstract void displayDetails();
}