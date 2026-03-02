package SS15.bai6;

import java.util.Stack;

class InputAction {
    String fieldName;
    String oldValue;
    String newValue;
    String actionTime;

    public InputAction(String field, String old, String next, String time) {
        this.fieldName = field;
        this.oldValue = old;
        this.newValue = next;
        this.actionTime = time;
    }
}

public class UndoManager {
    private Stack<InputAction> undoStack = new Stack<>();
    private final int maxUndoSteps = 5;

    public void saveAction(InputAction action) {
        if (undoStack.size() >= maxUndoSteps) undoStack.remove(0);
        undoStack.push(action);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            InputAction last = undoStack.pop();
            System.out.println("Undo: Trả lại '" + last.fieldName + "' giá trị cũ: " + last.oldValue);
        } else {
            System.out.println("Không còn thao tác để hoàn tác.");
        }
    }
}