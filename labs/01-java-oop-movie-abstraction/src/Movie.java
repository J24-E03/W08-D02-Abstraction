public class Movie extends Show {
    private String director;
    private int runtime;

    public Movie(String title, int releaseYear, double rating, boolean isOnNetflix, String director, int runtime) {
        super(title, releaseYear, rating, isOnNetflix);
        this.director = director;
        this.runtime = runtime;
    }


    @Override
    protected void displayShowInfo() {
        System.out.println("Title=" + getTitle() + ", releaseYear=" + getReleaseYear() + ", rating=" + getRating() +
                ", actors=" + getActors() + ", isOnNetflix=" + isOnNetflix() +
                ", director=" + getDirector() + ", runtime=" + getRuntime());
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public void play() {
        System.out.println(getTitle() + " is now playing!");
    }
}
