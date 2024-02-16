package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testCarIsInstanceOfVehicle() {
        Car car = new Car("Volkswagen", "Transporter", 2008);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Wish", 2015);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda CBR", "65OR", 2022);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testCarTestDriveSetsSpeedTo60() {
        Car car = new Car("Toyota", "Wish", 2015);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testMotorcycleTestDriveSetsSpeedTo75() {
        Motorcycle motorcycle = new Motorcycle("Honda CBR", "65OR", 2022);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testCarParkSetsSpeedToZero() {
        Car car = new Car("Toyota", "Wish", 2015);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void testMotorcycleParkSetsSpeedToZero() {
        Motorcycle motorcycle = new Motorcycle("Honda CBR", "65OR", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
