package SS15.bai5;

import java.util.Stack;

public class EmergencyCase {
    private String patientName; 
    private Stack<TreatmentStep> steps;

    public EmergencyCase(String patientName) {
        this.patientName = patientName;
        this.steps = new Stack<>();
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Đã thêm bước: " + step);
    }

    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            TreatmentStep removed = steps.pop();
            System.out.println("Hoàn tác bước: " + removed);
            return removed;
        }
        System.out.println("Không còn bước nào để hoàn tác!");
        return null;
    }

    public void displaySteps() {
        System.out.println("Lịch sử xử lý của bệnh nhân " + patientName + ":");
        if (steps.isEmpty()) {
            System.out.println("- Chưa có bước xử lý nào.");
        } else {
            for (int i = steps.size() - 1; i >= 0; i--) {
                System.out.println("  " + steps.get(i));
            }
        }
    }

    public String getPatientName() {
        return patientName;
    }
}