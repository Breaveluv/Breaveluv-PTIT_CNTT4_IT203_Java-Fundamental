package SS15.bai6;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {
    private Queue<Patient> waitingQueue = new LinkedList<>();

    public void addPatient(Patient p) {
        waitingQueue.add(p);
        System.out.println("Đã thêm: " + p);
    }

    public Patient getNextPatient() {
        return waitingQueue.poll();
    }

    public int getTotalPatients() {
        return waitingQueue.size();
    }
}