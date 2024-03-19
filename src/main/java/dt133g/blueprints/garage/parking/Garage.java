package dt133g.blueprints.garage.parking;

import dt133g.blueprints.garage.vehicle.Car;

import java.util.*;

public class Garage {

    private static final List<Parkingspace> parkingSpaces = new ArrayList<>();
    public Garage(){
        for(int i = 1; i <= 10; i++){
           parkingSpaces.add(new Parkingspace());
        }
    }

    public Boolean parkCar(Car car) {
        for(int i = 0; i <= parkingSpaces.size()-1; i++){
            if(parkingSpaces.get(i).parkCar(car)){
                System.out.println(String.format("%s parked car %s at space: %d", car.owner, car.licensePlate, i+1));
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return parkingSpaces.toString();
    }
}
