package SS14.bai5;

import java.util.TreeSet;

class Patient implements Comparable<Patient> {
    private String name;
    private int severity; 
    private int arrivalTime; 

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public int compareTo(Patient other) {
       
        if (this.severity != other.severity) {
            return Integer.compare(this.severity, other.severity);
        }
    
        if (this.arrivalTime != other.arrivalTime) {
            return Integer.compare(this.arrivalTime, other.arrivalTime);
        }
      
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        String level = (severity == 1) ? "Nguy kịch" : (severity == 2 ? "Nặng" : "Nhẹ");
        return String.format("Bệnh nhân %s (Mức %d - %s, Đến lúc: %02d:%02d)", 
                name, severity, level, arrivalTime / 100, arrivalTime % 100);
    }
}


public class main {
    public static void main(String[] args) {
       
        TreeSet<Patient> hangDoiCapCuu = new TreeSet<>();

        
        hangDoiCapCuu.add(new Patient("A", 3, 800)); // Mức 3, 8:00
        hangDoiCapCuu.add(new Patient("B", 1, 815)); // Mức 1, 8:15
        hangDoiCapCuu.add(new Patient("C", 1, 805)); // Mức 1, 8:05

      
        System.out.println("--- DANH SÁCH THỨ TỰ GỌI CẤP CỨU ---");
        for (Patient p : hangDoiCapCuu) {
            System.out.println(p);
        }
    }
}