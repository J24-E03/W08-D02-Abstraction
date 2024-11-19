import movie.database.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Instantiate Movie and TVShow objects
        Movie movie = new Movie("Iron Man", 2008, 8.5, null, true, "Jon Favreau", 126);
        TVShow tvShow = new TVShow("WandaVision", 2021, 8.0, null, true, 1, 9);

        // Create actors
        Actor actor1 = new Actor("Robert Downey Jr.", 58, "American", true, 1987, new ArrayList<>(), new ArrayList<>());
        Actor actor2 = new Actor("Scarlett Johansson", 39, "American", false, 1994, new ArrayList<>(), new ArrayList<>());

        // Create an ArrayList of actors
        ArrayList<Actor> movieActors = new ArrayList<>(Arrays.asList(actor1));
        ArrayList<Actor> tvShowActors = new ArrayList<>(Arrays.asList(actor2));

        // Add ArrayList of actors to objects
        movie.setActors(movieActors);
        tvShow.setActors(tvShowActors);

        // Add actors to the actors list
        movie.AddActor(actor2); 
        tvShow.AddActor(actor1);

        // Display show info for both Movie and TVShow
        movie.displayShowInfo();
        tvShow.displayShowInfo();

        // Test PlayableShow interface methods
        movie.play();
        tvShow.play();
    }
}