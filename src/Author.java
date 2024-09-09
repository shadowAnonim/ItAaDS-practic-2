public class Author {

    public String getName() {
        return name;
    }

    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private  String email;

    public char getGender() {
        return gender;
    }

    private char gender;

    public Author(String name, String email, char gender)
    {

    }

    @Override
    public String toString() {
        return String.join(",", name, email, Character.toString(gender));
    }
}
