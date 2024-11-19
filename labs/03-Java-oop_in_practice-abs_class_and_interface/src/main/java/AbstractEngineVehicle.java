public abstract class AbstractEngineVehicle implements Vehicle{

    private final int numberOfGears;

    private int currentGear;

    private boolean gearShouldIncrease;

    private boolean isOn;

    public AbstractEngineVehicle(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        currentGear = 0;
        gearShouldIncrease = true;
        isOn = false;
    }

    @Override
    public String start() {
        isOn = true;
        changeGear();
        return doStart();
    }

    @Override
    public String stop() {
        isOn = false;
        currentGear = 0;
        return doStop();
    }

    @Override
    public String changeGear() {
        if (!isOn) {
            return "You need to turn the vehicle on first.";
        }

        int previousGear = currentGear;

        if (gearShouldIncrease) {
            if (currentGear < numberOfGears) {
                currentGear++;
            } else {
                gearShouldIncrease = false;
                currentGear--;
            }
        } else {
            if (currentGear > 1) {
                currentGear--;
            } else {
                gearShouldIncrease = true;
                currentGear++;
            }
        }
        return "Changed from gear [" + previousGear + "] to [" + currentGear + "].";
    }

    protected abstract String doStart();

    protected abstract String doStop();

    public int getCurrentGear() {
        return currentGear;
    }
}
