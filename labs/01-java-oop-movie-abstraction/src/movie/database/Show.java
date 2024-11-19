package movie.database;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Show {
    private String title;
    private int releaseYear;
    private double rating;
    private ArrayList<Actor> actors;
    private boolean isOnNetflix;

    public Show(String title, int releaseYear, double rating, ArrayList<Actor> actors, boolean isOnNetflix) {
        setTitle(title);
        setReleaseYear(releaseYear);
        setRating(rating);
        setActors(actors);
        setIsOnNetflix(isOnNetflix);

    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public boolean getInOnNetflix() {
        return isOnNetflix;
    }

    public void setTitle(String title) {
        if (title.isBlank()) {
            System.out.println("Title cannot be empty.");
            if (this.title == null) {
                this.title = "Unknown";
            }
            return;
        }
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear < 1888) {
            System.out.println("Invalid release year.");
            this.releaseYear = 1888;
            return;
        }
        this.releaseYear = releaseYear;
    }

    public void setRating(double rating) {
        if (rating < 0.0 || rating > 10.0) {
            System.out.println("Invalid rating");
            this.rating = 0;
            return;
        }
        this.rating = rating;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void setIsOnNetflix(boolean onNetflix) {
        isOnNetflix = onNetflix;
    }

    public void AddActor(Actor actor) {
        if (actors.contains(actor)) {
            System.out.println("Actor already exists.");
            return;
        }
        actors.add(actor);
    }

    public String toString() {
        return title;
    }

    public abstract void displayShowInfo();
}
