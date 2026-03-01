package SS14.bai3;

import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Set<String> thuocMoi = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> diUng = new HashSet<>(Arrays.asList("Penicillin", "Aspirin", "Pollen"));

        Set<String> error = new HashSet<>(thuocMoi);
        error.retainAll(diUng);

        Set<String> anToan = new HashSet<>(thuocMoi);
        anToan.removeAll(diUng);

        System.out.println("Thuoc" + thuocMoi);
        System.out.println("Di ung "+ diUng);
        System.out.println("---");
        System.out.println("Cảnh báo dị ứng" + error);
        System.out.println("Thành phần an toàn " + anToan);
        
    }

}
