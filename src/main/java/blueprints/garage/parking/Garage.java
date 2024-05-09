package blueprints.garage.parking;

import blueprints.garage.support.PHRASES;
import blueprints.garage.vehicle.Car;
import blueprints.garage.support.Helpers;

import java.util.*;

public class Garage {
    public static Boolean garageDoorOpen = false;
    private final List<Parkingspace> parkingSpaces = new ArrayList<>();
    public Garage(){
        for(int i = 1; i <= 10; i++){
           parkingSpaces.add(new Parkingspace());
        }
    }

    public void error (){
        try {
            Helpers.throwError();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Boolean getGarageDoorOpen() {
        return garageDoorOpen;
    }
    public static void toggleGarageDoorOpen() {
        garageDoorOpen = !garageDoorOpen;
    }
}
