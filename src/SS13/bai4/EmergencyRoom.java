package SS13.bai4;

import java.util.LinkedList;

public class EmergencyRoom {
   
    private LinkedList<String> patientQueue = new LinkedList<>();

   
    public void patientCheckIn(String name) {
        patientQueue.addLast(name);
    }

    public void emergencyCheckIn(String name) {
        patientQueue.addFirst(name);
    }

   
    public void treatPatient() {
        if (patientQueue.isEmpty()) {
            System.out.println("Hàng đợi trống.");
            return;
        }

        String name = patientQueue.removeFirst();
        
      
        if (name.equals("C")) {
            System.out.println("Đang cấp cứu: " + name);
        } else {
            System.out.println("Đang khám: " + name);
        }
    }
}