public enum Gender {
    MALE("male"),
    FEMALE("female"),
    NON_BINARY("non-binary");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}