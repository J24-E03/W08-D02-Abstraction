package org.dcistudent.models.entertainment;

import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter @Setter
public class User {
    @NotBlank
    private String name;
    @NotNull
    private Integer age;
    @Email
    private String email;
    @NotBlank
    private String userType;
    @NotNull.List(@NotNull)
    private static final List<String> userTypes = new ArrayList<>();

    static {
        userTypes.addAll(List.of("Actor", "Director"));
    }

    /**
     * Creates a new user.
     *
     * @param name the name of the user
     * @param age the age of the user
     * @param email the email of the user
     */
    public User(@NotBlank String name, @NotNull Integer age, @NotBlank String email) {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    /**
     * Sets the user type.
     *
     * @param userType the user type
     * @return the user type
     */
    public User setUserType(
        @NotBlank(message = "User type cannot be empty.")
        String userType
    ) {
        if (userTypes.contains(userType)) {
            this.userType = userType;

            return this;
        }

        System.out.println("Invalid user type. Please enter either 'Actor' or 'Director'.");

        return this;
    }

    /**
     * Returns a string representation of a user.
     *
     * @return a string representation of a user
     */
    @Override
    public String toString() {
        return
            "Name: " + this.getName() +
            ", Age: " + this.getAge() +
            ", Email: " + this.getEmail() +
            ", User Type: " + this.getUserType()
        ;
    }
}
