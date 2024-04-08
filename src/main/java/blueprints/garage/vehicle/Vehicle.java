package blueprints.garage.vehicle;

import blueprints.garage.support.PHRASES;

public interface Vehicle {
    String owner = "";
    String licensePlate = "";

    void start();

    default void blowHorn(){
        System.out.println(PHRASES.carHorn);
    }
}
