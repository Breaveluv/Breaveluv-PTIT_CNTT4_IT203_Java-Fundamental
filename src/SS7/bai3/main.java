package SS7.bai3;

public class main {
    public static void bai3(String[] args) {
        
        double[] listScores = {6.5, 8.0, 4.5};

        
        System.out.print("Danh sách điểm: ");
        for (int i = 0; i < listScores.length; i++) {
            System.out.print(listScores[i] + (i == listScores.length - 1 ? "" : ", "));
        }

        System.out.println("\n\n>> Kết quả xử lý:");

       
        double avg = ScoreUtils.calculateAverage(listScores);
       
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", avg);

       
        for (double s : listScores) {
            boolean isPassed = ScoreUtils.checkPass(s);
            String status = isPassed ? "Đạt" : "Trượt";
            System.out.println("- Điểm " + s + ": " + status);
        }
    }
}