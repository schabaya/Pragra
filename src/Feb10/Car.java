package Feb10;

class Car extends Vehicle {
    int numDoors;


    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + this.numDoors);
    }
}

