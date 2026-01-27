package SS3.bai2;

import java.util.Scanner;

public class main {

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1; // Không tìm thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String[] books = {
            "Dac Nhan Tam", 
            "Nha Gia Kim", 
            "Mat Ma Da Vinci", 
            "Rung Nau Uy", 
            "Toi Thay Hoa Vang Tren Co Xanh"
        };

       
        System.out.print("Nhập tên sách bạn muốn tìm: ");
        String searchName = sc.nextLine();

       
        int index = searchBooks(books, searchName);

     
        if (index != -1) {
            System.out.println("Tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Sách không tồn tại.");
        }
    }
}