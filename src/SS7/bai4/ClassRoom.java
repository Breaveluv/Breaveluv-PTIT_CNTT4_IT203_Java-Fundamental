package SS7.bai4;

public class ClassRoom {
    
    public String studentName;

   
    public static double classFund = 0;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    
    public void contribute(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng: " + amount + " VNĐ");
    }

   
    public static void showFund() {
        System.out.println(">>> Tổng quỹ lớp hiện tại: " + classFund + " VNĐ");
    }
}