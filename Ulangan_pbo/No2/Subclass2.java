// Subclass2
public class Subclass2 extends SuperClass {
    // instance variable
    private String hobby;

    // constructor
    public Subclass2(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    // method
    public String getHobby() {
        return hobby;
    }
}