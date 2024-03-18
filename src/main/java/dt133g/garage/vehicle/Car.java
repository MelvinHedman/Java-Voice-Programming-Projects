package dt133g.garage.vehicle;

import dt133g.garage.parking.Parkingspace;

public class Car {

    private final String owner;
    private final String licensePlate;
    public Car(String owner, String licensePlate) {
        this.owner = owner;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
