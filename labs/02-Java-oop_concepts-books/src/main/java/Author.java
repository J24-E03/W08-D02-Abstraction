public class Author {
    private final String name;
    private String email;
    private final Gender gender;

    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author[name = " + name + ", email = " + email + ", gender = " + gender.getDescription();
    }
}
