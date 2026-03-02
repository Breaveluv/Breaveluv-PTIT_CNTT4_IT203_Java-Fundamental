package SS15.bai6;

public class main {
    public static void main(String[] args) {
        PatientWaitingQueue pQueue = new PatientWaitingQueue();
        pQueue.addPatient(new Patient(101, "Nguyễn Văn A", 30, "Nam"));
        pQueue.addPatient(new Patient(102, "Trần Thị B", 25, "Nữ"));

        UndoManager undoManager = new UndoManager();
        undoManager.saveAction(new InputAction("Chẩn đoán", "Trống", "Sốt xuất huyết", "09:00"));
        undoManager.undo();

        TicketSystem tickets = new TicketSystem();
        tickets.issueTicket("09:05");
        tickets.callNext();
    }
}