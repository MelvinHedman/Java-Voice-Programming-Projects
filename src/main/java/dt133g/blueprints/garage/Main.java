package dt133g.blueprints.garage;

import dt133g.blueprints.garage.parking.Garage;
import dt133g.blueprints.garage.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        for(int i = 1; i <= 11; i++){
            if(!garage.parkCar(new Car("carowner" +i, String.format("%s", i)))){
                System.out.println("Parking space full");
            }
        }
    }

}
