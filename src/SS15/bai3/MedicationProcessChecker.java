package SS15.bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack;

    public MedicationProcessChecker() {
        this.stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        for (int i = 0; i < actions.length; i++) {
            String action = actions[i].toUpperCase();

            if (action.equals("PUSH")) {
                stack.push("Medicine");
            } else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Lỗi tại bước " + (i + 1) + ": Thao tác hoàn tất (POP) không hợp lệ vì chưa có thuốc được phát (PUSH).");
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Lỗi: Kết thúc ca trực nhưng vẫn còn " + stack.size() + " thuốc chưa hoàn tất.");
            return false;
        }

        return true;
    }

    public void reset() {
        stack.clear();
    }
}