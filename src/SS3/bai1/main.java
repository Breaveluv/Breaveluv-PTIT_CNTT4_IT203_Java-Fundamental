package SS3.bai1;

import java.util.Scanner;

public class main {
    
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sách thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
       
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Nhập số lượng sách cần thêm: ");
        int n = sc.nextInt();

        int[] libraries = addBookToLibraries(n);

   
        displayLibraries(libraries);
    }
}