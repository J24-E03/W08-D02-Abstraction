public class User {
    private String name;
    private int age;
    private String email;
    private String userType;

    public User(String name, int age, String email, String userType) {

        setName(name);
        setAge(age);
        setEmail(email);
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }

    }

    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("Name needs to be between 0 and 130");
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void displayUserInfo() {
        System.out.println("name: " + name + ", age: " + age + " ,email:" + email + " ,userType: " + userType);
    }

    public String toString() {
        return "name: " + name + ", age: " + age + " ,email:" + email + " ,userType: " + userType;
    }
}
