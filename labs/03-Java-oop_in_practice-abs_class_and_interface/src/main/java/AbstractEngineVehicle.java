import jakarta.validation.constraints.Min;
import lombok.*;

@Getter @Setter
public abstract class AbstractEngineVehicle implements Vehicle {
    private final int numberOfGears;
    @Min(0)
    private int currentGear = 0;
    private boolean gearShouldIncrease = false;
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
            return doStop();
        }

        return "The vehicle is already off!";
    }

    @Override
    public String changeGear() {
        if (this.isOn() && this.getCurrentGear() < this.getNumberOfGears()) {
            this.setCurrentGear(this.getCurrentGear() + 1);
            return "Gear changed to " + this.getCurrentGear();
        }

        return "The vehicle is off or already in the highest gear!";
    }

    protected abstract String doStart();
    protected abstract String doStop();
}
