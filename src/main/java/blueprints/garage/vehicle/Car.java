package blueprints.garage.vehicle;

import blueprints.garage.support.PHRASES;

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

}
