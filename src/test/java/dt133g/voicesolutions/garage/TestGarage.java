package dt133g.voicesolutions.garage;
import blueprints.garage.support.PHRASES;
import blueprints.garage.parking.Garage;
import blueprints.garage.parking.Parkingspace;
import blueprints.garage.vehicle.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class TestGarage {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testParkingACar() {
        Garage garage = new Garage();
        Car car = new Car("Alice", "ABC123");
        Boolean parked = garage.parkCar(car);
        Assertions.assertTrue(parked, "The car should be successfully parked.");
    }

    @Test
    public void testParkingSpaceLimit() {
        Garage garage = new Garage();
        for (int i = 0; i < 10; i++) {
            Car car = new Car("Owner" + i, "XYZ" + i);
            Boolean parked = garage.parkCar(car);
            Assertions.assertTrue(parked, "The car should be successfully parked.");
        }


        Car extraCar = new Car("Bob", "EXTRA1");
        Boolean parked = garage.parkCar(extraCar);
        Assertions.assertFalse(parked, "No space should be available for an extra car.");
    }

    @Test
    public void testThrowError(){
        Garage garage = new Garage();
        garage.error();
        String expectedMessage = PHRASES.errorMessage;
        Assertions.assertEquals(expectedMessage, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    @Test
    public void testCarHorn() {
        Car car = new Car("Owner", "abc123");
        String expectedMessage = PHRASES.carHorn;
        car.blowHorn();
        Assertions.assertEquals(expectedMessage, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    @Test
    public void testStartCar() {
        Car car = new Car("Owner", "abc123");
        String expectedMessage = PHRASES.carStarting;
        car.start();
        Assertions.assertEquals(expectedMessage, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    @Test
    public void testStaticGarageDoor() {
        Assertions.assertFalse(Garage.garageDoorOpen, "GarageDoor");
        Garage.toggleGarageDoorOpen();
        Assertions.assertTrue(Garage.getGarageDoorOpen(), "GarageDoor");

        Garage.toggleGarageDoorOpen();
        Assertions.assertEquals(Garage.getGarageDoorOpen(), false);
        Garage.toggleGarageDoorOpen();
        Assertions.assertEquals(Garage.getGarageDoorOpen(), true);
    }

    @Test
    public void testLeavingParkingSpace() {
        Garage garage = new Garage();
        Parkingspace parkingspace = new Parkingspace();
        Car car = new Car("Charlie", "DEF456");
        Boolean parked = parkingspace.parkCar(car);

        if (parked) {
            parkingspace.leaveSpace();
            Assertions.assertNull(parkingspace.getCar(), "Parking space should be empty after leaving.");
        } else {
            Assertions.fail("Car should have been parked successfully before leaving.");
        }
    }
}
