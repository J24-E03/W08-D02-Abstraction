package org.dcistudent;

import org.dcistudent.models.entertainment.Movie;
import org.dcistudent.models.entertainment.TvShow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this.Shows();
    }

    private void Shows() {
        Movie movie = new Movie(
            "Forrest Gump",
            1994,
            "Drama",
            "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other historical events unfold.",
            "Robert Zemeckis",
            8.8,
            List.of("Tom Hanks")
        );
        movie.setOnNetflix(true);
        movie.setRuntime(142);
        movie.displayShowInfo();
        movie.play();

        System.out.println("--------------------------------------------------");

        TvShow tvShow = new TvShow(
            "Breaking Bad",
            2008,
            9.5,
            5,
            62,
            List.of("Bryan Cranston", "Aaron Paul")
        );
        tvShow.displayShowInfo();
        tvShow.play();

    }
}