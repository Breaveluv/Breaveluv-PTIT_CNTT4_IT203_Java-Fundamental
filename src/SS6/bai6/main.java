package SS6.bai6;

public class main {
    public static void main(String[] args) {
        System.out.println("===== Hệ Thống Quản Lý Người Dùng =====\n");

        User user1 = new User("U001", "nguyenvanA", "pass123", "nguyena@example.com");
        user1.hienThiThongTin();

        User user2 = new User("U002", "tranthiB", "secure456", "thib@gmail.com");
        user2.hienThiThongTin();

        System.out.println("--- Test cập nhật email hợp lệ ---");
        user1.setEmail("nguyena@newmail.com");

        System.out.println("\n--- Test cập nhật email không hợp lệ ---");
        user1.setEmail("invalid-email");

        System.out.println("\n--- Test cập nhật mật khẩu hợp lệ ---");
        user2.setPassword("newpass789");

        System.out.println("\n--- Test cập nhật mật khẩu rỗng ---");
        user2.setPassword("");

        System.out.println("\n--- Test cập nhật mật khẩu null ---");
        user2.setPassword(null);

        System.out.println("\n--- Thông tin người dùng sau các thay đổi ---");
        user1.hienThiThongTin();
        user2.hienThiThongTin();
    }
}
