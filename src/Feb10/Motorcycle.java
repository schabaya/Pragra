package Feb10;

class Motorcycle extends Vehicle {
    int numCylinders;

    public Motorcycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of cylinders: " + this.numCylinders);
    }
}