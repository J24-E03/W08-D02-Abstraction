import jakarta.validation.constraints.Min;
import lombok.*;

@Getter @Setter
public abstract class AbstractEngineVehicle implements Vehicle {
    private final int numberOfGears;
    @Min(1)
    private int currentGear = 1;
    private boolean gearShouldIncrease = true;
    private boolean isOn = false;

    protected AbstractEngineVehicle(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String start() {
        if (this.isOn()) {
            return "The vehicle is already on!";
        }

        this.setOn(true);
        return doStart();
    }

    @Override
    public String stop() {
        if (this.isOn()) {
            this.setOn(false);
            this.setCurrentGear(0);
            return doStop();
        }

        return "The vehicle is already off!";
    }

    @Override
    public String changeGear() {
        if (this.isOn() && this.getCurrentGear() == this.getNumberOfGears()) {
            this.setGearShouldIncrease(false);
        }

        if (this.isOn() && this.getCurrentGear() == 1) {
            this.setGearShouldIncrease(true);
        }

        // shift up
        if (this.isOn() && this.getCurrentGear() < this.getNumberOfGears() && this.isGearShouldIncrease()) {
            this.setCurrentGear(this.getCurrentGear() + 1);
            return "Changed from gear [" + (this.getCurrentGear() - 1) + "] to [" + this.getCurrentGear() + "].";
        }

        // shift down
        if (this.isOn() && this.getCurrentGear() > 1 && !this.isGearShouldIncrease()) {
            this.setCurrentGear(this.getCurrentGear() - 1);
            return "Changed from gear [" + (this.getCurrentGear() + 1) + "] to [" + this.getCurrentGear() + "].";
        }

        return "You need to turn the vehicle on first.";
    }

    protected abstract String doStart();
    protected abstract String doStop();
}
