package SS9.bai5;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10000000L));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20000L));
        employees.add(new ProductionEmployee("Le Van C", 150, 30000L));

        System.out.println("Danh sách lương nhân viên:");
        long total = 0;
        int i = 1;
        for (Employee e : employees) {
            long salary = e.calculateSalary();
            System.out.print(i++ + ". " + e.getName() + " (");
            if (e instanceof OfficeEmployee) {
                System.out.print("Office) - Lương: " + salary);
            } else if (e instanceof ProductionEmployee) {
                ProductionEmployee p = (ProductionEmployee) e;
                System.out.print("Production) - Lương: " + salary + " (" + p.getNumOfProducts() + " sản phẩm * "
                        + p.getPrice() + ")");
            } else {
                System.out.print("Unknown) - Lương: " + salary);
            }
            System.out.println();
            total += salary;
        }

        System.out.println();
        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " + total);
    }
}
