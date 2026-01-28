package SS4.bai4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void min(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma the thu vien: ");
        String cardCode = sc.nextLine();

        Pattern prefixPattern = Pattern.compile("^[A-Z]{2}.*");
        Pattern yearPattern = Pattern.compile("^[A-Z]{2}\\d{4}.*");
        Pattern fullPattern = Pattern.compile("^[A-Z]{2}\\d{4}\\d{5}$");

        Matcher prefixMatcher = prefixPattern.matcher(cardCode);
        Matcher yearMatcher = yearPattern.matcher(cardCode);
        Matcher fullMatcher = fullPattern.matcher(cardCode);

        if (!prefixMatcher.matches()) {
            System.out.println("Loi: Thieu tien to hoac tien to khong hop le (phai la 2 chu cai viet hoa)");
        } 
        else if (!yearMatcher.matches()) {
            System.out.println("Loi: Nam vao hoc khong hop le (phai gom 4 chu so)");
        } 
        else if (!fullMatcher.matches()) {
            System.out.println("Loi: Ma the phai ket thuc bang 5 chu so");
        } 
        else {
            System.out.println("Ma the hop le!");
        }

        sc.close();
    }
}
