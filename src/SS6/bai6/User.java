package SS6.bai6;

public class User {
    private String id;
    private String username;
    private String password;
    private String email;

    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
            System.out.println("✓ Cập nhật mật khẩu thành công");
        } else {
            System.out.println("✗ Lỗi: Mật khẩu không được rỗng!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
            System.out.println("✓ Cập nhật email thành công");
        } else {
            System.out.println("✗ Lỗi: Email không hợp lệ!");
        }
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public void hienThiThongTin() {
        System.out.println("=== Thông Tin Người Dùng ===");
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Password: ****");
        System.out.println("Email: " + email);
        System.out.println("=============================\n");
    }
}
