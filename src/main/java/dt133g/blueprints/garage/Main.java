package dt133g.blueprints.garage;

import dt133g.blueprints.garage.parking.Garage;
import dt133g.blueprints.garage.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        try {
            for(int i = 1; i <= 11; i++){
                garage.parkCar(new Car("carowner" +i, String.format("ABC%s%s%s", i, i-1, i)));
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
