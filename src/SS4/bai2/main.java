package SS4.bai2;

public class main {
    public static void main(String[] args) {
        String description = "Cuốn sách lập trình Java cơ bản. Kệ: A3-12, dành cho sinh viên IT.";

        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + "Kệ:".length();
            int end = description.indexOf(",", start);

            if (end == -1) {
                end = description.length();
            }

            String viTriKe = description.substring(start, end).trim();
            System.out.println("Mã vị trí kệ: " + viTriKe);

            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mô tả mới: " + newDescription);
        } else {
            System.out.println("Không tìm thấy thông tin kệ sách.");
        }
    }
}
