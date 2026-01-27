package SS1.bai4;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double giaUSD = sc.nextDouble(); 
        System.out.print("Nhập tỷ giá (VND/USD - kiểu float): ");
        float tyGia = sc.nextFloat(); 

       
        double tongTienChinhXac = giaUSD * tyGia;

       
        long tongTienLamTron = (long) tongTienChinhXac;

        System.out.println("Giá chính xác (số thực): " + tongTienChinhXac);
        System.out.println("Giá làm tròn để thanh toán (long): " + tongTienLamTron);
        
        sc.close();
    }
}