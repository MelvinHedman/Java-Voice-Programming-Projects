package dt133g.garage;

import dt133g.garage.parking.Garage;
import dt133g.garage.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        System.out.println(garage.toString());

        Car carOne = new Car("Melvin", "Dt111");
        Car carTwo = new Car("Andreas", "Dt122");
        System.out.println("PARKING:");
        garage.parkCar(carOne);
        System.out.println(garage.toString());
        System.out.println("PARKING: ");
        garage.parkCar(carTwo);
        System.out.println(garage.toString());

        System.out.println(garage.toString());
    }
}
