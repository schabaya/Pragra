package Feb10;

class Vehicle {
    String make;
    String model;
    int year;

  public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start() {
        System.out.println(this.make + " " + this.model + " has started.");
    }
    public void stop() {
        System.out.println(this.make + " " + this.model + " has stopped.");
    }
    public void displayInfo() {
        System.out.println("Vehicle Info: " + this.year + " " + this.make + " " + this.model);
    }
}
