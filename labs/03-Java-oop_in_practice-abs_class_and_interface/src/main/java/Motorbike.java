public class Motorbike extends AbstractEngineVehicle{
    public Motorbike() {
        super(6);
        //TODO write here...
    }

    @Override
    protected String doStart() {
        //TODO write here...
        return "Starting the motorbike";
    }

    @Override
    protected String doStop() {
        //TODO write here...
        return  "Stopping the motorbike";
    }

    @Override
    public String drive() {
        //TODO write here...
        return "Driving the motorbike";
    }
}
