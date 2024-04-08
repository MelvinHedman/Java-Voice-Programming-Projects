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
    public Boolean parkCar(Car car) {
        for(int i = 0; i <= parkingSpaces.size()-1; i++){
            if(parkingSpaces.get(i).parkCar(car)){
                System.out.println(String.format(PHRASES.carParked, car.owner, car.licensePlate, i+1));
                return true;
            }
        }
        error();
        return false;
    }


    public static Boolean getGarageDoorOpen() {
        return garageDoorOpen;
    }
    public static void toggleGarageDoorOpen() {
        garageDoorOpen = !garageDoorOpen;
    }
}
