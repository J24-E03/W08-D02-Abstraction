import java.util.ArrayList;

public class Actor extends User {

    private String nationality;
    private boolean hasOscars;
    private int debutYear;
    private ArrayList<Movie> movies;

    public Actor(String name, int age, String email, String nationality, boolean hasOscars, int debutYear, ArrayList<Movie> movies) {
        super(name, age, email, "codealong.Actor");
        this.nationality = nationality;
        this.hasOscars = hasOscars;
        this.debutYear = debutYear;
        this.movies = movies;
    }

    public void displayUserInfo() {
        super.displayUserInfo();
        System.out.println(", nationality: " + nationality + ", hasOscars: " + hasOscars + ", debutYear" + debutYear + ", movies:" + movies);
    }
}
