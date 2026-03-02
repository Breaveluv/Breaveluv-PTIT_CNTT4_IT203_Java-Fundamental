package SS15.bai1;

import java.util.Stack;

class EditAction {
    private String description;
    private String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() { return description; }
    public String getTime() { return time; }

    @Override
    public String toString() {
        return String.format("[%s] %s", time, description);
    }
}

class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("-> Đã thêm: " + action.getDescription());
    }

    public EditAction undoEdit() {
        if (isEmpty()) {
            System.out.println("! Không có gì để hoàn tác.");
            return null;
        }
        return history.pop();
    }

    public EditAction getLatestEdit() {
        return isEmpty() ? null : history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (isEmpty()) {
            System.out.println("Lịch sử đang trống.");
            return;
        }
        System.out.println("\n--- LỊCH SỬ HỒ SƠ BỆNH ÁN ---");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
        System.out.println("----------------------------\n");
    }
}

public class main {
    public static void main(String[] args) {
        MedicalRecordHistory medicalHistory = new MedicalRecordHistory();

        medicalHistory.addEdit(new EditAction("Chẩn đoán ban đầu: Viêm họng", "08:00"));
        medicalHistory.addEdit(new EditAction("Kê đơn: Paracetamol 500mg", "08:05"));
        medicalHistory.addEdit(new EditAction("Điều chỉnh liều: 2 viên/ngày", "08:10"));

        medicalHistory.displayHistory();

        System.out.println("Kiểm tra hành động mới nhất: " + medicalHistory.getLatestEdit());

        System.out.println("\n*** Bác sĩ bấm nút Hoàn tác ***");
        EditAction undone = medicalHistory.undoEdit();
        if (undone != null) {
            System.out.println("Đã xóa: " + undone.getDescription());
        }

        medicalHistory.displayHistory();
    }
}