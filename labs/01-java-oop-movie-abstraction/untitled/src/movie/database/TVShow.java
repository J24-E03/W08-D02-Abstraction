package movie.database;

import java.util.ArrayList;

public class TVShow extends Show implements PlayableShow{

    private int seasonCount;
    private int totalEpisodes;

    public TVShow(String title, int releaseYear, double rating, ArrayList<Actor> actors, boolean isOnNetflix, int seasonCount, int totalEpisodes) {
        super(title, releaseYear, rating, actors, isOnNetflix);
        setSeasonCount(seasonCount);
        setTotalEpisodes(totalEpisodes);
    }

    public int getSeasonCount() {
        return seasonCount;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setSeasonCount(int seasonCount) {
        this.seasonCount = seasonCount;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    @Override
    public void displayShowInfo() {
        System.out.println(Colors.GOLD_YELLOW + "Printing properties of Movie:" + Colors.BRIGHT_RED + getTitle() + Colors.BRIGHT_RED);
        System.out.println(Colors.DARK_GREEN + "Release Year" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + getReleaseYear());
        System.out.println(Colors.DARK_GREEN + "Rating" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + getRating());
        System.out.println(Colors.DARK_GREEN + "Actors" + Colors.GOLD_YELLOW + ": " + Colors.PASTEL_GREEN +  getActors() );
        System.out.println(Colors.DARK_GREEN + "Season Count" + Colors.GOLD_YELLOW + ": " + Colors.PASTEL_GREEN +  seasonCount);
        System.out.println(Colors.DARK_GREEN + "total Episodes" + Colors.GOLD_YELLOW + ": " + Colors.PASTEL_GREEN +  totalEpisodes );
        System.out.println(Colors.DARK_GREEN + "isOnNetflix" + Colors.GOLD_YELLOW + ": " + Colors.PASTEL_GREEN +  getInOnNetflix() );
        System.out.println(Colors.DARK_TEAL + "==================================\n" + Colors.GOLD_YELLOW);
    }

    @Override
    public void play() {
        System.out.println(super.toString() + " is now Playing.");
    }
}
