import lombok.*;

@Getter @Setter
public class Bicycle implements Vehicle {
    private boolean isChained = true;
    private boolean isDriving = false;

    public String start() {
        if (this.isChained()) {
            this.setChained(false);
            return "Starting to bike!";
        }

        if (this.isDriving()) {
            return "Bicycle is already driving.";
        }

        return "Bicycle is already unchained.";
    }

    public String stop() {
        if (this.isChained()) {
            return "Bicycle is already chained.";
        }

        this.setDriving(false);
        this.setChained(true);
        return "Stopping the bike!";
    }

    public String drive() {
        if (this.isChained()) {
            return "Bicycle is not unchained.";
        }

        this.setDriving(true);
        return "Biking around!";
    }

    public String changeGear() {
        return "This bike only has one gear, so cannot change it.";
    }
}
