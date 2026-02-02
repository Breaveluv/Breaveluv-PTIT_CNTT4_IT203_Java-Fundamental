package SS7.bai4;

public class main {
    public static void bai4(String[] args) {
       
        ClassRoom studentA = new ClassRoom("Nguyễn Văn An");
        studentA.contribute(50000);
        
       
        ClassRoom.showFund();

       
        ClassRoom studentB = new ClassRoom("Trần Thị Bình");
        studentB.contribute(100000);

       
        ClassRoom.showFund();

       
        ClassRoom studentC = new ClassRoom("Lê Văn Cường");
        studentC.contribute(20000);

      
        System.out.println("\n--- Kết quả sau cùng ---");
        ClassRoom.showFund();
    }
}