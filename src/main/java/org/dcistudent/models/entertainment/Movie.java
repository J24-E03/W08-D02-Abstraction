package org.dcistudent.models.entertainment;

import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import lombok.*;
import org.dcistudent.interfaces.models.entertainment.Playable;

@Getter @Setter
public class Movie extends AbstractShow implements Playable {
    @NotBlank(message = "Genre cannot be empty.")
    private String genre;
    @NotBlank(message = "Plot cannot be empty.")
    private String plot;
    @NotBlank(message = "Director cannot be empty.")
    private String director;
    @Min(1) private int runtime;
    @NotNull.List(@NotNull)
    private static final List<String> genres = new ArrayList<>();

    static {
        genres.addAll(List.of("Action", "Adventure", "Comedy", "Crime", "Drama"));
    }

    /**
     * Creates a new movie.
     *
     * @param title the title of the movie
     * @param genre the genre of the movie
     * @param plot the plot of the movie
     * @param director the director of the movie
     * @param rating the rating of the movie
     * @param actors the actors in the movie
     */
    public Movie(
        String title,
        int releaseYear,
        String genre,
        String plot,
        String director,
        double rating,
        List<String> actors
    ) {
        super(title, releaseYear, rating, actors);
        this.setTitle(title);
        this.setGenre(genre);
        this.setPlot(plot);
        this.setDirector(director);
        this.setRating(rating);
    }

    /**
     * Sets the genre of the movie.
     *
     * @param genre the genre of the movie
     * @return the genre of the movie
     */
    public Movie setGenre(
        @NotBlank(message = "Genre cannot be empty.")
        String genre
    ) {
        if (genres.contains(genre)) {
            this.genre = genre;

            return this;
        }

        System.out.println(
            "Currently we do not support this genre on our site. Please use the addGenre() method to add a new genre."
        );

        return this;
    }

    /**
     * Adds a new genre to the list of genres.
     *
     * @param genre the genre to add to the list of genres
     * @return true if the genre was added to the list of genres, false otherwise
     */
    public boolean addGenre(
        @NotBlank(message = "Genre cannot be empty.")
        String genre
    ) {
        if (genres.contains(genre.toLowerCase())) {
            System.out.println("Genre already exists.");

            return false;
        }

        return genres.add(genre);
    }

    /**
     * Sets the rating of the movie.
     *
     * @param rating the rating of the movie
     * @return the Movie object
     */
    public Movie setRating(
        @NotNull(message = "Rating cannot be empty.")
        Double rating
    ) {
        if (rating < 0 || rating > 10) {
            System.out.println("Invalid rating. Please enter a value between 0 and 10.");

            return this;
        }

        this.setRating(rating);

        return this;
    }

    /**
     * Adds an actor to the movie.
     *
     * @param actor the actor to add to the movie
     * @return true if the actor was added to the movie, false otherwise
     */
    public boolean addActor(
        @NotBlank(message = "Actor cannot be empty.")
        String actor
    ) {
        if (this.getActors().contains(actor)) {
            System.out.println("Actor already exists in the movie.");

            return false;
        }

        return this.getActors().add(actor);
    }

    /**
     * Displays the movie information.
     *
     * @return String representation of the movie
     */
    @Override
    public String toString() {
        StringBuilder movieInfo = new StringBuilder();
        movieInfo.append(super.toString());
        movieInfo.append("Genre: ").append(this.getGenre()).append("\n");
        movieInfo.append("Plot: ").append(this.getPlot()).append("\n");
        movieInfo.append("Director: ").append(this.getDirector()).append("\n");

        return movieInfo.toString();
    }

    /**
     * Finds an actor in the movie.
     *
     * @param actor the actor to find in the movie
     * @return true if the actor was found in the movie, false otherwise
     */
    public boolean findActor(@NotNull Actor actor) {
        return this.getActors().contains(actor);
    }

    /**
     * Displays the movie information.
     */
    @Override
    public void displayShowInfo() {
        System.out.println(this);
    }

    /**
     * Plays the movie.
     */
    public void play() {
        System.out.println("Playing movie: " + this.getTitle() + ". Enjoy!");
    }
}
