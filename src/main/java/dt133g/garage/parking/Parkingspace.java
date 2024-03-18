package dt133g.garage.parking;

import dt133g.garage.vehicle.Car;

public class Parkingspace {

    Car car = null;

    public Parkingspace(){}

    public void parkCar(Car car){
        this.car = car;
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
