import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Our Test suite! DO NOT MODIFY IT!
 */
public class TestSuite {

    @Test
    public void givenBicycle_whenNeedToDrive_ThenStart() {
        Vehicle bike = new Bicycle();

        assertEquals("Starting to bike!", bike.start());
        assertEquals("Biking around!", bike.drive());
        assertEquals("This bike only has one gear, so cannot change it.", bike.changeGear());
        assertEquals("Stopping the bike!", bike.stop());
    }

    @Test
    public void givenCar_whenNeedToDriveFast_ThenChangeGear() {
        final String carType = "BMW";
        Vehicle car = new Car(carType);

        assertEquals("Starting the " + carType, car.start());
        assertEquals(1, ((AbstractEngineVehicle) car).getCurrentGear(), "When starting the car, the gear should " +
                "change to 1!");
        assertEquals("Driving a " + carType, car.drive());

        assertEquals("Changed from gear 1 to 2.", car.changeGear());
        assertEquals("Changed from gear 2 to 3.", car.changeGear());
        assertEquals("Changed from gear 3 to 4.", car.changeGear());
        assertEquals("Changed from gear 4 to 5.", car.changeGear());
    }

    @Test
    public void givenCar_whenNeedToStopAfterDrivingFast_ThenSlowDownAndStop() {
        final String carType = "Mercedes";
        Vehicle car = new Car(carType);

        assertEquals("Starting the " + carType, car.start());
        assertEquals(1, ((AbstractEngineVehicle) car).getCurrentGear(), "When starting the car, the gear should " +
                "change to 1!");
        assertEquals("Driving a " + carType, car.drive());

        assertEquals("Changed from gear 1 to 2.", car.changeGear());
        assertEquals("Changed from gear 2 to 3.", car.changeGear());
        assertEquals("Changed from gear 3 to 4.", car.changeGear());
        assertEquals("Changed from gear 4 to 5.", car.changeGear());

        assertEquals("Changed from gear 5 to 4.", car.changeGear());
        assertEquals("Changed from gear 4 to 3.", car.changeGear());
        assertEquals("Changed from gear 3 to 2.", car.changeGear());
        assertEquals("Changed from gear 2 to 1.", car.changeGear());

        assertEquals("Changed from gear 1 to 2.", car.changeGear());

        assertEquals("Stopping the " + carType, car.stop());
        assertEquals(0, ((AbstractEngineVehicle) car).getCurrentGear(), "When stopping the car, the gear should " +
                "change to 0!");
    }

    @Test
    public void givenCar_whenTryingToChangeGearBeforeStartingTheCar_ThenDontChange() {
        final String carType = "Golf";
        Vehicle car = new Car(carType);

        assertEquals("You need to turn the vehicle on first.", car.changeGear());

        assertEquals("Starting the " + carType, car.start());

        assertEquals("Changed from gear 1 to 2.", car.changeGear());

        assertEquals("Stopping the " + carType, car.stop());

        assertEquals("You need to turn the vehicle on first.", car.changeGear());
    }

    @Test
    public void givenMotorbike_whenNeedToDrive_thenStart() {
        Vehicle bike = new Motorbike();

        assertEquals("Starting the motorbike", bike.start());
        assertEquals("Driving the motorbike", bike.drive());
        assertEquals("Changed from gear 1 to 2.", bike.changeGear());
        assertEquals("Stopping the motorbike", bike.stop());
    }
}
