package dt133g.blueprints.garage.vehicle;

import dt133g.blueprints.garage.support.PHRASES;

public class Car implements Vehicle{

    public final String owner;
    public final String licensePlate;
    public Car(String owner, String licensePlate) {
        this.owner = owner;
        this.licensePlate = licensePlate;
    }

    public void start() {
        System.out.println(PHRASES.carStarting);
    }


    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
