package blueprints.garage.parking;

import blueprints.garage.vehicle.Car;

public class Parkingspace {

    Car car = null;

    public Parkingspace(){}

    public Boolean parkCar(Car car) {
        if(this.car != null){
            return false;
        }
        this.car = car;
        return true;
    }

    public void leaveSpace(){
        this.car = null;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Parkingspace{" +
                "car=" + car +
                '}';
    }
}
