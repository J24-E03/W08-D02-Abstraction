package movie.database;

import java.util.ArrayList;

import java.time.LocalDate;

public class Actor {
    private String name;
    private int age;
    private String nationality;
    private boolean hasWonOscar;
    private int debutYear;
    private ArrayList<Movie> movies;
    private ArrayList<TVShow> tvShows;

    public Actor(String name, int age, String nationality, boolean hasWonOscar, int debutYear, ArrayList<Movie> movies, ArrayList<TVShow> tvShows) {
        setName(name);
        setAge(age);
        setNationality(nationality);
        setHasWonOscar(hasWonOscar);
        setDebutYear(debutYear);
        this.movies = movies;
        this.tvShows = tvShows;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isHasWonOscar() {
        return hasWonOscar;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<TVShow> getTvShows() {
        return tvShows;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("User's name cannot be blank!");
            if (this.name == null) {
                this.name = "Unknown";
            }
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 130) {
            System.out.println("User's age is invalid!");
            this.age = 40;
            return;
        }
        this.age = age;
    }

    public void setNationality(String nationality) {
        if (nationality.isBlank()) {
            System.out.println("User's nationality cannot be blank!");
            if (this.nationality == null) {
                this.nationality = "Unknown nationality";
            }
            return;

        }
        this.nationality = nationality;
    }

    public void setDebutYear(int debutYear) {
        if (debutYear < LocalDate.now().getYear() - this.getAge()) {
            System.out.println("Actor's debut year is invalid!\n");
            this.debutYear = 1990;
            return;
        }
        this.debutYear = debutYear;
    }

    public void setHasWonOscar(boolean hasWonOscar) {
        this.hasWonOscar = hasWonOscar;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void setTvShows(ArrayList<TVShow> tvShows) {
        this.tvShows = tvShows;
    }

    public void addMovie(Movie movie) {
        if (movies.contains(movie)) {
            System.out.println("Movie already exists.");
            return;
        }
        movies.add(movie);
    }

    public void addTVShow(TVShow tvShow) {
        if (tvShows.contains(tvShow)) {
            System.out.println("TVShow already exists.");
            return;
        }
        tvShows.add(tvShow);
    }
}
