package SS4.bai1;

import java.util.Scanner;

public class main {

   
    public static String normalize(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }

  
    public static String capitalizeWords(String s) {
        String[] words = s.toLowerCase().split(" ");
        String result = "";
        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        return result.trim();
    }

    public static void man(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();

        System.out.print("Nhập thể loại: ");
        String category = sc.nextLine();

        bookName = normalize(bookName).toUpperCase();
        author = capitalizeWords(normalize(author));
        category = normalize(category);

        System.out.println(bookName + " - Tác giả: " + author);
    }
}
