package SS1.bai5;
import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Nhập mã sách (4 chữ số): ");
        int maSach = sc.nextInt();

       
      
        int units = maSach % 10;       
        int dozens = (maSach / 10) % 10;    
        int hundreds = (maSach / 100) % 10;  
        int thousands = maSach / 1000;     
       
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        
      
        int expectedCheckDigit = sumOfFirstThreeNumber % 10;
        
    
        boolean isValid = (expectedCheckDigit == units);

       
        System.out.println("Chữ số kiểm tra kỳ vọng: " + expectedCheckDigit);
        System.out.print("Kết quả kiểm tra mã sách: ");
        System.out.println(isValid ? "HỢP LỆ" : "KHÔNG HỢP LỆ");

        sc.close();
    }
}