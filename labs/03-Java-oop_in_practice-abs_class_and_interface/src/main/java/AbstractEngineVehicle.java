public abstract class AbstractEngineVehicle implements Vehicle{

    private final int numberOfGears;

    private int currentGear;

    private boolean gearShouldIncrease;

    private boolean isOn;

    public AbstractEngineVehicle(int numberOfGears) {
        //TODO write here...
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String start() {
        //TODO write here...
        isOn = true;
        currentGear = 1;
        return doStart();
    }

    @Override
    public String stop() {
        //TODO write here...
        isOn = false;
        currentGear = 0;
        return doStop();
    }

    @Override
    public String changeGear() {
        //TODO write here...
        if (!isOn) {
            return "You need to turn the vehicle on first.";
        }

        int oldGear = currentGear;

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

        return "Changed from gear " + oldGear + " to " + currentGear + ".";
    }



    protected abstract String doStart();

    protected abstract String doStop();

    public int getCurrentGear() {
        return currentGear;
    }
}
