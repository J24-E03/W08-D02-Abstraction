public class Car extends AbstractEngineVehicle{

    private final String model;

    public Car(String model) {
        super(5);
        //TODO write here...
        this.model = model;
    }

    @Override
    protected String doStart() {
        //TODO write here...
        return "Starting the " + model;
    }

    @Override
    protected String doStop() {
        //TODO write here...
        return "Stopping the " + model;
    }

    @Override
    public String drive() {
        //TODO write here...
        return "Driving a " + model;
    }
}
