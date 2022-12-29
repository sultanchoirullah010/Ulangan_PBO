// Subclass3
public class Subclass3 extends SuperClass {
    // instance variable
    private String address;

    // constructor
    public Subclass3(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }

    // method
    public String getAddress() {
        return address;
    }
}