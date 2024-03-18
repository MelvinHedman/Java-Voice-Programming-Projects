package dt133g.blueprints.garage.vehicle;

public class Car {

    public final String owner;
    public  final String licensePlate;
    public Car(String owner, String licensePlate) {
        this.owner = owner;
        this.licensePlate = licensePlate;
    }


    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
