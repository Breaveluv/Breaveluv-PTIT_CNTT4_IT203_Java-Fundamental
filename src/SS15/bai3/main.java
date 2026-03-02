package SS15.bai3;

public class main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] quyTrinh1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("--- Kiểm tra Quy trình 1 ---");
        display(checker.checkProcess(quyTrinh1));
        checker.reset();

        String[] quyTrinh2 = {"PUSH", "POP", "POP"};
        System.out.println("\n--- Kiểm tra Quy trình 2 ---");
        display(checker.checkProcess(quyTrinh2));
        checker.reset();

        String[] quyTrinh3 = {"PUSH", "PUSH", "POP"};
        System.out.println("\n--- Kiểm tra Quy trình 3 ---");
        display(checker.checkProcess(quyTrinh3));
    }

    private static void display(boolean result) {
        if (result) {
            System.out.println("=> Kết luận: Quy trình HỢP LỆ.");
        } else {
            System.out.println("=> Kết luận: Quy trình KHÔNG HỢP LỆ.");
        }
    }
}