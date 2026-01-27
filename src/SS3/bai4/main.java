package SS3.bai4;

import java.util.Random;

public class main {

    public static void sortBooks(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void Main(String[] args) {
        int n = 10;
        int[] isbn = new int[n];
        Random rd = new Random();

       
        for (int i = 0; i < n; i++) {
            isbn[i] = rd.nextInt(9000) + 1000; 
        }

        System.out.println("Mảng trước khi sắp xếp:");
        displayBooks(isbn);

        sortBooks(isbn);

        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        displayBooks(isbn);
    }
}
