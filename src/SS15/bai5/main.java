package SS15.bai5;

public class main {
    public static void main(String[] args) {
        EmergencyCaseQueue hospitalQueue = new EmergencyCaseQueue();

  
        hospitalQueue.addCase(new EmergencyCase("Nguyễn Văn A"));
        hospitalQueue.addCase(new EmergencyCase("Trần Thị B"));

       
        System.out.println("\n--- Đang xử lý bệnh nhân 1 ---");
        EmergencyCase currentCase = hospitalQueue.getNextCase();
        
        if (currentCase != null) {
            currentCase.addStep(new TreatmentStep("Tiếp nhận", "08:00"));
            currentCase.addStep(new TreatmentStep("Xét nghiệm máu", "08:15"));
            currentCase.addStep(new TreatmentStep("Tiêm thuốc nhầm", "08:30")); // Bước sai
            
            currentCase.undoStep();
            
            currentCase.addStep(new TreatmentStep("Tiêm kháng sinh", "08:35"));
            
            currentCase.displaySteps();
        }
    }
}