import java.util.ArrayList;

public abstract class Show implements Playable {
    private String title;
    private int releaseYear;
    private double rating;
    private ArrayList<Actor> actors;
    private boolean isOnNetflix;

    public Show(String title, int releaseYear, double rating, boolean isOnNetflix) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.isOnNetflix = isOnNetflix;
        this.actors = new ArrayList<>();
    }

    protected abstract void displayShowInfo();

    protected void addActor(Actor actor) {
        this.actors.add(actor);
        System.out.println(actor.getName() + " was added to " + getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public boolean isOnNetflix() {
        return isOnNetflix;
    }

    public void setOnNetflix(boolean onNetflix) {
        isOnNetflix = onNetflix;
    }
}
