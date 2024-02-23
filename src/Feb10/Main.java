package Feb10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 4);
        car.start();
        car.displayInfo();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021, 2);
        motorcycle.start();
        motorcycle.displayInfo();
        motorcycle.stop();

        ElectricCar electricCar = new ElectricCar("Tesla", "Model Y", 2022, 4, 75);
        electricCar.start();
        electricCar.displayInfo();
        electricCar.chargeBattery();
        electricCar.stop();
    }
}