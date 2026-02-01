package SS6.bai5;

public class Book {
    private String tenSach;
    private String tacGia;
    private double gia;
    private int namXuatBan;

    public Book(String tenSach, String tacGia, double gia, int namXuatBan) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.namXuatBan = namXuatBan;
    }

    public void hienThiThongTin() {
        System.out.println("=== Thông Tin Sách ===");
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Giá: " + gia + " VNĐ");
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("=======================\n");
    }
}
