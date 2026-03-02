package SS15.bai2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        this.queue = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Đã thêm bệnh nhân: " + p.getName());
    }

    public Patient callNextPatient() {
        if (isEmpty()) {
            System.out.println("Hàng đợi trống, không có bệnh nhân nào!");
            return null;
        }
        return queue.poll(); 
    }

    public Patient peekNextPatient() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Không có bệnh nhân đang chờ.");
            return;
        }
        System.out.println("\n--- DANH SÁCH BỆNH NHÂN ĐANG CHỜ ---");
        for (Patient p : queue) {
            System.out.println(p);
        }
        System.out.println("------------------------------------\n");
    }
}