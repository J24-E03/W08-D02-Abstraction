public class Main {
    public static void main(String[] args) {
        Show movie = new Movie("Batman", 2000, 5.0, true, "Tom Cruise", 3600);
        Show tvShow = new TvShow("Spiderman", 2005, 3.0, false, 10, 300);
        movie.displayShowInfo();
        tvShow.displayShowInfo();
        System.out.println();

        movie.addActor(new Actor("Ben Afleck", 40, "ben@gmail.com", "american", true, 2003, null));
        movie.displayShowInfo();
        tvShow.addActor(new Actor("Angelina Jolie", 35, "angelina@gmail.com", "spanish", false, 2012, null));
        tvShow.displayShowInfo();
        System.out.println();

        movie.play();
        tvShow.play();
    }
}
