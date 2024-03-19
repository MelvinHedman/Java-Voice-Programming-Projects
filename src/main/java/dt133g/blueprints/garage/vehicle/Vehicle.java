package dt133g.blueprints.garage.vehicle;

import dt133g.blueprints.garage.support.PHRASES;

public interface Vehicle {
    String owner = "";
    String licensePlate = "";

    void start();

    default void blowHorn(){
        System.out.println(PHRASES.carHorn);
    }

}
