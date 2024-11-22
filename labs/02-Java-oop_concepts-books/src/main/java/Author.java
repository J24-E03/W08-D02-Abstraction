import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lombok.*;

@Getter @Setter
public class Author {
    @NotBlank(message = "Name cannot be empty.")
    private String name;
    @Email
    private String email;
    private char gender;
    private static ArrayList<Character> genders = new ArrayList<>(List.of('m', 'f', 'u'));

    public Author(String name, String email, Character gender) {
        this.setName(name);
        this.setEmail(email);
        this.setGender(gender);
    }

    public String getGender() {
        HashMap<Character, String> shortToLong = new HashMap<>();
        shortToLong.put('m', "Male");
        shortToLong.put('f', "Female");
        shortToLong.put('u', "Diverse");

        return shortToLong.get(this.gender);
    }

    private Author setGender(Character gender) {
        if (genders.contains(gender)) {
            this.gender  = gender;

            return this;
        }

        throw new IllegalArgumentException("Invalid gender entry: " + gender);
    }

    public String toString() {
        return "Author[name=" + this.getName() + ", email=" + this.getEmail() + ", gender=" + this.getGender() + "]";
    }
}
