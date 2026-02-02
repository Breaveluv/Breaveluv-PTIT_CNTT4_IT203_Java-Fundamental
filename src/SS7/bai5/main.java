package SS7.bai5;

public class main {
    public static void bai5(String[] args) {
        double studentScore = 8.5;

        System.out.println("Tên trường: " + Config.SCHOOL_NAME);
        
       
        if (studentScore >= Config.MIN_SCORE && studentScore <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ!");
        }

    }
}