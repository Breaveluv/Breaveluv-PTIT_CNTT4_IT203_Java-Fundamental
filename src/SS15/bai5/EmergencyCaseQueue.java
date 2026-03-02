package SS15.bai5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        this.cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        cases.add(c);
        System.out.println("Bệnh nhân " + c.getPatientName() + " đã vào hàng đợi.");
    }

    public EmergencyCase getNextCase() {
        return cases.poll(); 
    }
}