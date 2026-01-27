package SS3.bai5;

import java.util.Scanner;

public class main {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Không tìm thấy mã sách cần xóa!");
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa sách có mã: " + bookId);
        return n - 1;
    }

    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = { 101, 203, 305, 407, 509 };
        int n = books.length;

        while (n > 0) {
            System.out.println("Danh sách sách hiện tại:");
            displayBooks(books, n);

            System.out.print("Nhập mã sách cần xóa: ");
            int bookId = sc.nextInt();

            n = deleteBook(books, n, bookId);

            if (n == 0) {
                System.out.println("Tất cả sách đã bị xóa!");
                break;
            }

            System.out.print("Bạn có muốn xóa tiếp không? (y/n): ");
            sc.nextLine();
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
