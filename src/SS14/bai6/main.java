package SS14.bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Patient {
    String name;
    int age;
    String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}

public class main {
    public static void main(String[] args) {

        List<Patient> inputList = new ArrayList<>();
        inputList.add(new Patient("Lan", 45, "Tim mạch"));
        inputList.add(new Patient("Hùng", 30, "Nội tiết"));
        inputList.add(new Patient("Mai", 50, "Tim mạch"));
        inputList.add(new Patient("Bình", 25, "Nhi"));
        inputList.add(new Patient("An", 60, "Tim mạch"));

        Map<String, List<Patient>> mapKhoa = new HashMap<>();

        for (Patient p : inputList) {
            String tenKhoa = p.department;

            if (!mapKhoa.containsKey(tenKhoa)) {
                mapKhoa.put(tenKhoa, new ArrayList<>());
            }

            mapKhoa.get(tenKhoa).add(p);
        }

        System.out.println("--- DANH SÁCH BỆNH NHÂN THEO KHOA ---");
        for (var entry : mapKhoa.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + ": " + entry.getValue());
        }

        String khoaDongNhat = "";
        int maxBenhNhan = -1;

        for (var entry : mapKhoa.entrySet()) {
            int soLuong = entry.getValue().size();
            if (soLuong > maxBenhNhan) {
                maxBenhNhan = soLuong;
                khoaDongNhat = entry.getKey();
            }
        }

        System.out.println("--- PHÂN TÍCH TẢI ---");
        System.out.println("Khoa " + khoaDongNhat + " đang đông nhất (" + maxBenhNhan + " bệnh nhân).");
    }
}