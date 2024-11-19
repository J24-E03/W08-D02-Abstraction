public class Car extends AbstractEngineVehicle{


    private final String model;
    private static final int NUM_OF_GEARS = 5;

    public Car(String model) {
        super(NUM_OF_GEARS);
        this.model = model;
    }

    @Override
    protected String doStart() {
        return "Starting the " + model;
    }

    @Override
    protected String doStop() {
        return "Stopping the " + model;
    }

    @Override
    public String drive() {
       return "Driving a " +  model;
    }
}
