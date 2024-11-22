package org.dcistudent.models.entertainment;

import jakarta.validation.constraints.*;

import java.util.List;
import lombok.*;

@Getter @Setter
public abstract class AbstractShow {
    @NotBlank(message = "Title cannot by empty")
    private String title;
    private int releaseYear;
    private double rating;
    @NotBlank.List(@NotBlank(message = "Actors cannot be empty."))
    private List<String> actors;
    private boolean isOnNetflix = false;

    /**
     * Creates a new show.
     *
     * @param title the title of the show
     * @param releaseYear the release year of the show
     * @param rating the rating of the show
     * @param actors the actors in the show
     */
    protected AbstractShow(
        String title,
        int releaseYear,
        double rating,
        List<String> actors)
    {
        this.setTitle(title);
        this.setReleaseYear(releaseYear);
        this.setRating(rating);
        this.setActors(actors);
    }

    /**
     * Adds an actor to the show.
     *
     * @param actor the actor to add
     * @return whether the actor was added
     */
    protected boolean addActor(@NotBlank(message = "Actor cannot be empty.") String actor) {
        if (this.actors.contains(actor)) {
            return false;
        }

        return this.actors.add(actor);
    }

    /**
     * Displays the show information.
     *
     * @return String representation of the show
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(this.title).append("\n");
        sb.append("Release Year: ").append(this.releaseYear).append("\n");
        sb.append("Rating: ").append(this.rating).append("\n");
        sb.append("Actors: ").append(this.actors).append("\n");
        sb.append("On Netflix: ").append(this.isOnNetflix).append("\n");

        return sb.toString();
    }

    abstract void displayShowInfo();
}
