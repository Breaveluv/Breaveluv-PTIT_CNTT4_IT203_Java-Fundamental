package SS9.bai3;

public class main {
    public static void Main(String[] args) {
        Manager m = new Manager("Le Van B", 1500.0, "IT");
        m.displayInfo();

        
        Employee e = new Manager("Tran Thi C", 2000.0, "HR");
        System.out.println("--- via Employee reference ---");
        e.displayInfo();
    }
}
