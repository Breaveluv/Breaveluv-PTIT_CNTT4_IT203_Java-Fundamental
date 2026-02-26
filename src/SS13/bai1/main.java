package SS13.bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
      
        ArrayList<Double> nhietDoList = new ArrayList<>(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));
        
        System.out.println("Danh sách ban đầu: " + nhietDoList);

      
        Iterator<Double> it = nhietDoList.iterator();
        while (it.hasNext()) {
            double value = it.next();
            if (value < 34.0 || value > 42.0) {
                it.remove(); 
            }
        }

        
        double tong = 0;
        for (double temp : nhietDoList) {
            tong += temp;
        }
        
       
        double trungBinh = nhietDoList.isEmpty() ? 0 : tong / nhietDoList.size();

       
        System.out.println("Danh sách sau khi lọc: " + nhietDoList);
        
        System.out.printf("Nhiệt độ trung bình: %.2f\n", trungBinh);
    }
}