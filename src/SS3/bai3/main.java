import java.util.Scanner;

public class main {

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.println("Sách có số lượng nhiều nhất:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println(names[i] + " - " + quantities[i]);
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.println("Sách có số lượng ít nhất:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println(names[i] + " - " + quantities[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        String[] names = new String[n];
        int[] quantities = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sách " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Nhập số lượng: ");
            quantities[i] = Integer.parseInt(sc.nextLine());
        }

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}
