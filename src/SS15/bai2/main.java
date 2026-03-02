package SS15.bai2;

public class main {
    public static void main(String[] args) {
        PatientQueue clinic = new PatientQueue();

        // 1. Tiếp nhận bệnh nhân
        clinic.addPatient(new Patient("BN01", "Nguyễn Văn A", 25));
        clinic.addPatient(new Patient("BN02", "Trần Thị B", 40));
        clinic.addPatient(new Patient("BN03", "Lê Văn C", 65));

        clinic.displayQueue();

        System.out.println("Bệnh nhân chuẩn bị khám: " + clinic.peekNextPatient().getName());

        Patient p1 = clinic.callNextPatient();
        System.out.println("\n>>> Đang khám cho: " + p1);

        clinic.displayQueue();
    }
}
