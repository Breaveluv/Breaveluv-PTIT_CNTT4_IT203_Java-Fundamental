package SS6.bai4;

public class main {
    public static void main(String[] args) {
        System.out.println("===== Tạo Nhân Viên Bằng Các Constructor Khác Nhau =====\n");

     
        System.out.println("--- Constructor không tham số ---");
        Employee nv1 = new Employee();
        nv1.hienThiThongTin();

        System.out.println("--- Constructor có mã và tên ---");
        Employee nv2 = new Employee("NV001", "Nguyễn Văn A");
        nv2.hienThiThongTin();

   
        System.out.println("--- Constructor có đầy đủ mã, tên, lương ---");
        Employee nv3 = new Employee("NV002", "Trần Thị B", 25000000);
        nv3.hienThiThongTin();

       
        System.out.println("--- Tạo thêm nhân viên ---");
        Employee nv4 = new Employee("NV003", "Lê Văn C", 30000000);
        nv4.hienThiThongTin();

        Employee nv5 = new Employee("NV004", "Phạm Thị D");
        nv5.hienThiThongTin();
    }
}
