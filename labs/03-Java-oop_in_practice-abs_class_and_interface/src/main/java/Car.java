public class Car extends AbstractEngineVehicle{
    private final String model;

    public Car(String model) {
        super(5);
        this.model = model;
    }

    @Override
    protected String doStart() {
        this.start();

        return "Starting the " + this.model;
    }

    @Override
    protected String doStop() {
        this.stop();

        return "Stopping the " + this.model;
    }

    @Override
    public String drive() {
        return "Driving a " + this.model;
    }
}
