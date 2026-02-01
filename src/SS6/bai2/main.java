package SS6.bai2;

public class main {
    public static void main(String[] args) {

      
        Account acc = new Account(
                "namnguyen",
                "123456",
                "nam@gmail.com"
        );

       
        System.out.println("=== Thông tin ban đầu ===");
        acc.displayInfo();

       
        acc.changePassword("abcdef");

        
        System.out.println("\n=== Sau khi đổi mật khẩu ===");
        acc.displayInfo();
    }
}
