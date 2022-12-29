// Subclass1
public class Subclass1 extends SuperClass {
    // instance variable
    private String job;

    // constructor
    public Subclass1(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    // method
    public String getJob() {
        return job;
    }
}