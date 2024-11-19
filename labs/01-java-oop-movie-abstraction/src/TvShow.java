public class TvShow extends Show {
    private int seasonCount;
    private int totalEpisodes;

    public TvShow(String title, int releaseYear, double rating, boolean isOnNetflix, int seasonCount, int totalEpisodes) {
        super(title, releaseYear, rating, isOnNetflix);
        this.seasonCount = seasonCount;
        this.totalEpisodes = totalEpisodes;
    }

    @Override
    protected void displayShowInfo() {
        System.out.println("Title=" + getTitle() + ", releaseYear=" + getReleaseYear() + ", rating=" + getRating() +
                ", actors=" + getActors() + ", isOnNetflix=" + isOnNetflix() +
                ", seasonCount=" + getSeasonCount() + ", totalEpisodes=" + getTotalEpisodes());
    }

    public int getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(int seasonCount) {
        this.seasonCount = seasonCount;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    @Override
    public void play() {
        System.out.println(getTitle() + " is now playing!");
    }
}
