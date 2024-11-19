package movie.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie extends Show implements PlayableShow{

    private String director;
    private int runtime;

    public Movie(String title, int releaseYear, double rating, ArrayList<Actor> actors, boolean isOnNetflix, String director, int runtime) {
        super(title, releaseYear, rating, actors, isOnNetflix);
        setDirector(director);
        setRuntime(runtime);
    }

    public String getDirector() {
        return director;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setDirector(String director) {
        if (director.isBlank()) {
            System.out.println("Director cannot be empty.");
            if (this.director == null) {
                this.director = "Unknown";
            }
            return;
        }
        this.director = director;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public void displayShowInfo() {
        System.out.println(Colors.GOLD_YELLOW + "Printing properties of Movie:" + Colors.BRIGHT_RED + getTitle() + Colors.BRIGHT_RED);
        System.out.println(Colors.DARK_GREEN + "Release Year" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + getReleaseYear());
        System.out.println(Colors.DARK_GREEN + "Rating" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + getRating());
        System.out.println(Colors.DARK_GREEN + "Director" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + director );
        System.out.println(Colors.DARK_GREEN + "Actors" + Colors.GOLD_YELLOW + ": " + Colors.PASTEL_GREEN +  getActors() );
        System.out.println(Colors.DARK_GREEN + "runtime" + Colors.GOLD_YELLOW + ": " + Colors.PASTEL_GREEN +  runtime );
        System.out.println(Colors.DARK_GREEN + "isOnNetflix" + Colors.GOLD_YELLOW + ": " + Colors.PASTEL_GREEN +  getInOnNetflix() );
        System.out.println(Colors.DARK_TEAL + "==================================\n" + Colors.GOLD_YELLOW);
    }

    @Override
    public void play() {
        System.out.println(super.toString() + " is now Playing.");
    }
}
