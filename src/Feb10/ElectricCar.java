package Feb10;

class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String make, String model, int year, int numDoors, int batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery() {
                System.out.println(this.make + " " + this.model + " is charging.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + this.batteryCapacity + " kWh");
    }
}