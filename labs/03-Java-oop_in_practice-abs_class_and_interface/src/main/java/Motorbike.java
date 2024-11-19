public class Motorbike extends AbstractEngineVehicle{

    private static final int NUM_OF_GEARS = 6;

    public Motorbike() {
        super(NUM_OF_GEARS);
    }

    @Override
    protected String doStart() {
        return "Starting the motorbike";
    }

    @Override
    protected String doStop() {
        return "Stopping the motorbike";
    }

    @Override
    public String drive() {
        return "Driving the motorbike";
    }
}
