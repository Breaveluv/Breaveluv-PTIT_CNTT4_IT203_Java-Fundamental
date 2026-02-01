package SS6.bai5;

public class main {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 350000, 2008);
        book1.hienThiThongTin();

        Book book2 = new Book("Effective Java", "Joshua Bloch", 420000, 2018);
        book2.hienThiThongTin();

        Book book3 = new Book("Design Patterns", "Gang of Four", 480000, 1994);
        book3.hienThiThongTin();
    }
}
