package org.dcistudent.models.entertainment;

import java.util.List;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.dcistudent.interfaces.models.entertainment.Playable;

@Getter @Setter
public class TvShow extends AbstractShow implements Playable {
    @Min(1) private int seasonCount;
    @Min(1) private int totalEpisodes;

    /**
     * Creates a new TV show.
     *
     * @param title the title of the TV show
     * @param releaseYear the release year of the TV show
     * @param rating the rating of the TV show
     * @param seasonCount the season count of the TV show
     * @param totalEpisodes the total episodes of the TV show
     * @param actors the actors in the TV show
     */
    public TvShow(
        String title,
        int releaseYear,
        double rating,
        int seasonCount,
        int totalEpisodes,
        List<String> actors
    ) {
        super(title, releaseYear, rating, actors);
        this.setSeasonCount(seasonCount);
        this.setTotalEpisodes(totalEpisodes);
    }

    /**
     * Displays the TV show information.
     *
     * @return String representation of the TV show
     */
    @Override
    public String toString() {
        StringBuilder tvShowInfo = new StringBuilder();
        tvShowInfo.append(super.toString());
        tvShowInfo.append("Season Count: ").append(this.getSeasonCount()).append("\n");
        tvShowInfo.append("Total Episodes: ").append(this.getTotalEpisodes()).append("\n");

        return tvShowInfo.toString();
    }

    /**
     * Displays the TV show information.
     */
    @Override
    public void displayShowInfo() {
        System.out.println(this);
    }

    /**
     * Plays the TV show.
     */
    public void play() {
        System.out.println("Playing TV Show: " + this.getTitle() + ". Enjoy!");
    }
}
