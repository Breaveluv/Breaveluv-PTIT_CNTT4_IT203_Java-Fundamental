package SS15.bai4;

public class main {
    public static void main(String[] args) {
        EmergencyQueue hospitalQueue = new EmergencyQueue();

        hospitalQueue.addPatient(new EmergencyPatient("BN01", "Nguyễn Văn A", 2)); 
        hospitalQueue.addPatient(new EmergencyPatient("BN02", "Trần Thị B", 1));   
        hospitalQueue.addPatient(new EmergencyPatient("BN03", "Lê Văn C", 2));   
        hospitalQueue.addPatient(new EmergencyPatient("BN04", "Phạm Thị D", 1));  

        System.out.println("\n--- Gọi bệnh nhân khám ---");
        
        for (int i = 0; i < 4; i++) {
            EmergencyPatient next = hospitalQueue.callNextPatient();
            if (next != null) {
                System.out.println("Mời bệnh nhân: " + next);
            }
        }
    }
}