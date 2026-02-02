package SS7.bai2;

public class main {
    public static void bai2(String[] args) {
      
        int a = 10;
        int b = a; 
        b = 20;   

        System.out.println("--- So sánh kiểu nguyên thủy (int) ---");
        System.out.println("Giá trị của a: " + a);
        System.out.println("Giá trị của b: " + b); 

      
        Student sv1 = new Student("An");
        Student sv2 = sv1;
        
        sv2.name = "Bình"; 

        System.out.println("\n--- So sánh kiểu tham chiếu (Object) ---");
        System.out.println("Tên của sv1: " + sv1.name); 
        System.out.println("Tên của sv2: " + sv2.name); 
    }
}