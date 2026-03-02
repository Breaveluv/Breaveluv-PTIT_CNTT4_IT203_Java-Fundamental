package SS15.bai6;

import java.util.Stack;

class EditAction {
    String description;
    String editedBy;
    String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }
}

public class MedicalRecordHistory {
    private Stack<EditAction> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public void displayHistory() {
        System.out.println("Lịch sử bệnh án " + recordId + ":");
        for (int i = editStack.size() - 1; i >= 0; i--) {
            EditAction a = editStack.get(i);
            System.out.println("  - " + a.editTime + ": " + a.description + " (" + a.editedBy + ")");
        }
    }
}