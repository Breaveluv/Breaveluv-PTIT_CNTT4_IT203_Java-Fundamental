package SS15.bai6;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Patient(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "BN[" + id + "]: " + name + " (" + age + " tuổi, " + gender + ")";
    }
}