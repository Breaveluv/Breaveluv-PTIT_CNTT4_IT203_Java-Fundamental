package SS7.bai1;

public class main {
    public static void bai1(String[] args) {
        
        Student sv1 = new Student(1, "Nguyễn Văn A");
        sv1.displayInfo();
        Student.displayTotalStudent();

        System.out.println();

    
        Student sv2 = new Student(2, "Trần Thị B");
        sv2.displayInfo();
        Student.displayTotalStudent();

        System.out.println();

    
        Student sv3 = new Student(3, "Lê Văn C");
        sv3.displayInfo();
        Student.displayTotalStudent();

        System.out.println();

        
        Student sv4 = new Student(4, "Phạm Quỳnh D");
        sv4.displayInfo();
        Student.displayTotalStudent();

        System.out.println("\n--- Chứng minh static chỉ có 1 bản sao ---");
        System.out.println("Hiện tại tất cả đối tượng đều thấy tổng số sinh viên = 4");
        sv1.displayInfo();
        sv2.displayInfo();
        sv3.displayInfo();
        sv4.displayInfo();
        Student.displayTotalStudent();
    }
}
