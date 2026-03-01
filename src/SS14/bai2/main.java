package SS14.bai2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Map<String,String> danhmucThuoc=new HashMap<>();

        danhmucThuoc.put("T01", "Paracetamol");
        danhmucThuoc.put("T02", "Ibuprofen");
        danhmucThuoc.put("T03", "Amocicillin");
        danhmucThuoc.put("T04", "Vitamin C");
        danhmucThuoc.put("T05", "Cetirizine");

        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap ma thuoc can tra cuu: ");
        String maNhap = scanner.nextLine();

        if(danhmucThuoc.containsKey(maNhap)){
          String tenThuoc = danhmucThuoc.get(maNhap);
          System.out.println("Kết quả: Tên thuốc: " + tenThuoc);
        }else{
            System.out.println("Kết quả: Thuốc không có trong danh mục BHYT");
        }

    }
}
