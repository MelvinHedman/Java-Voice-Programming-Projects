package dt133g.garage.parking;

import dt133g.garage.vehicle.Car;

import java.util.*;

public class Garage {
    private static final Map<Integer, Map<Integer, Parkingspace>> parkingSpaces = new HashMap<>();
    public Garage(){
        for(int column = 1; column <= 5; column++){
            Map<Integer, Parkingspace> map = new HashMap<>();
            for(int row = 1; row <= 5; row++){
                map.put(row, new Parkingspace());
            }
            parkingSpaces.put(column, map);
        }
    }

    public void parkCar(Car car){
        for(Integer column: parkingSpaces.keySet()){
            for(Integer row: parkingSpaces.get(column).keySet()){
                if(parkingSpaces.get(column).get(row).getCar() == null){
                    parkingSpaces.get(column).get(row).parkCar(car);
                    return;
                }
            }
        }
    }


    @Override
    public String toString() {
        return parkingSpaces.toString();
    }
}
