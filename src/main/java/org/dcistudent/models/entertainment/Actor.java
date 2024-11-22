package org.dcistudent.models.entertainment;

import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter @Setter
public class Actor extends User {
    @NotBlank
    String nationality;
    boolean wonOscar = false;
    int debutYear;
    @NotNull.List(@NotNull)
    private final List<Movie> movies = new ArrayList<>();

    /**
     * Creates a new user.
     *
     * @param name  the name of the user
     * @param age   the age of the user
     * @param email the email of the user
     */
    public Actor(
        @NotBlank String name,
        @NotNull Integer age,
        @Email String email,
        @NotBlank String nationality,
        boolean wonOscar,
        int debutYear
    ) {
        super(name, age, email);
        this.setNationality(nationality);
        this.setWonOscar(wonOscar);
        this.setDebutYear(debutYear);
        this.setUserType("Actor");
    }

    /**
     * Gets whether the actor has won an Oscar.
     *
     * @return whether the actor has won an Oscar
     */
    public boolean hasWonOscar() {
        return this.wonOscar;
    }

    /**
     * Sets the debut year of the actor.
     *
     * @param debutYear the debut year of the actor
     * @return the Actor object
     */
    public Actor setDebutYear(int debutYear) {
        int birthYear = LocalDateTime.now().getYear() - this.getAge();

        if (debutYear < this.getAge() || debutYear-birthYear > 130) {
            System.out.println(
                "Invalid debut year. Please enter a year between the actor's age and ." + (birthYear+130)
            );

            return this;
        }

        this.debutYear = debutYear;

        return this;
    }

    /**
     * Adds a movie to the actor.
     *
     * @param movie the movie to add to the actor
     * @return true if the movie was added to the actor, false otherwise
     */
    public boolean addMovie(
        @NotNull(message = "Movie cannot be empty.")
        Movie movie
    ) {
        if (this.getMovies().contains(movie)) {
            System.out.println("Movie already exists in the actor.");

            return false;
        }

        return this.getMovies().add(movie);
    }

    /**
     * Returns a string representation of the actor.
     *
     * @return a string representation of the actor
     */
    @Override
    public String toString() {
        return
            "Name: " + this.getName() +
            "\nAge: " + this.getAge() +
            "\nNational: " + this.getNationality() +
            "\nHas won Oscar: " + this.hasWonOscar() +
            "\nDebut year: " + this.getDebutYear() +
            "\nMovies: " + this.getMovies().size()
        ;
    }
}
