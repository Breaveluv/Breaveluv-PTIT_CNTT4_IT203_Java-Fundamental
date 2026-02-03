package MiniPrjSS8;

public class Student {
    // ===== Thuộc tính (Encapsulation) =====
    private String id;
    private String name;
    private double score;

    // ===== Constructor không tham số =====
    public Student() {
    }

    // ===== Constructor đầy đủ tham số =====
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // ===== Getter & Setter =====
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

   
    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else {
            return "Trung Binh";
        }
    }

   
    public String toString() {
        return "ID: " + id +
               " | Ten: " + name +
               " | Diem: " + score +
               " | Hoc luc: " + getRank();
    }
}

