public class Motorbike extends AbstractEngineVehicle{
    public Motorbike() {
        super(6);
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
