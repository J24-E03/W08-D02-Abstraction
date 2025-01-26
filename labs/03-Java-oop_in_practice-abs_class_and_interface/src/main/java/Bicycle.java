public class Bicycle implements Vehicle{

    @Override
    public String start() {
        return "Starting to bike!";
    }

    @Override
    public String stop() {
        return "Stopping the bike!";
    }

    @Override
    public String drive() {
        return "Biking around!";
    }

    @Override
    public String changeGear() {
        return "This bike only has one gear, so cannot change it.";
    }
}
