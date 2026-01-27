package SS1.bai1;

import java.util.Scanner;

public class main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
     System.out.print("Nhập mã sách: ");
     String BookID=sc.nextLine(); 
     
     System.out.print("Nhập tên sách");
     String bookName=sc.nextLine();

     System.out.print("Nhập năm xuất bản");
     int publicYear=sc.nextInt();

       System.out.print("Nhập giá sách: ");
        double price = sc.nextDouble();

     System.out.print("Sách còn không ? (true/flase):  ");
     boolean isAvailable=sc.nextBoolean();


     int age = 2026 - publicYear;

    System.out.println("\n== Thông tin sách ====");
    System.out.println("Mã sách : "+ BookID);
    System.out.println("Tên sách:  "+bookName);
    System.out.println("Năm xuất bản: "+publicYear);
    System.out.printf("Giá tiền : %.2f\n",price+"đồng");
    System.out.println("Tuổi thọ sách "+age );
    System.out.println("Tình trạng: "+(isAvailable?"còn sách":"Đã mượn"));

    sc.close();
    
    
    }
}
