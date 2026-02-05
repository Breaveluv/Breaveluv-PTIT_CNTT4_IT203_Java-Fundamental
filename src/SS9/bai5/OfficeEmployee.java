package SS9.bai5;

public class OfficeEmployee extends Employee {
    private long baseSalary;

    public OfficeEmployee(String name, long baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public long calculateSalary() {
        return baseSalary;
    }

    public long getBaseSalary() {
        return baseSalary;
    }
}
