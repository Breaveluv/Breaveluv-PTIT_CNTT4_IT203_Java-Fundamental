package SS15.bai4;

import java.util.PriorityQueue;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> queue;

    public EmergencyQueue() {
        this.queue = new PriorityQueue<>();
    }

    public void addPatient(EmergencyPatient p) {
        queue.add(p);
        System.out.println("Đã thêm bệnh nhân: " + p.getName());
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi trống!");
            return null;
        }
        return queue.poll();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân chờ.");
            return;
        }
        System.out.println("Danh sách bệnh nhân đang chờ (theo thứ tự ưu tiên):");
      
        Object[] patients = queue.toArray();
        for (Object p : patients) {
            System.out.println(p);
        }
    }
}