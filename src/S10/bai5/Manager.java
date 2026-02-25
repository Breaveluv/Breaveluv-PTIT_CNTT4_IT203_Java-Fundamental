package S10.bai5;

public class Manager extends Employee implements BonusCalculator {
    private double bonusPercentage;

    public Manager(String name, double baseSalary, double bonusPercentage) {
        super(name, baseSalary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }

    @Override
    public double getBonus() {
        return baseSalary * bonusPercentage / 100;
    }
}
