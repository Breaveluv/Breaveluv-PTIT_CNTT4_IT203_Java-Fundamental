package SS7.bai1;

public class Student {
    
    private int id;
    private String name;

   
    private static int totalStudent = 0;

    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++; 
    }

  
    public void displayInfo() {
        System.out.println("Mã sinh viên: " + id + ", Tên sinh viên: " + name);
    }

  
    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }


    public static int getTotalStudent() {
        return totalStudent;
    }
}
