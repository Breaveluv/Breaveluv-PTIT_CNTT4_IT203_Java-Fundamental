package SS14.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
       
        List<String> danhSachCaBenh = new ArrayList<>();

  
        danhSachCaBenh.add("Cúm A");
        danhSachCaBenh.add("Sốt xuất huyết");
        danhSachCaBenh.add("Cúm A");
        danhSachCaBenh.add("Covid-19");
        danhSachCaBenh.add("Cúm A");
        danhSachCaBenh.add("Sốt xuất huyết");

     
        Map<String, Integer> thongKeBenh = new TreeMap<>();

        for (String benh : danhSachCaBenh) {
            if (thongKeBenh.containsKey(benh)) {
                thongKeBenh.put(benh, thongKeBenh.get(benh) + 1);
            } else {
                thongKeBenh.put(benh, 1);
            }
        }

        System.out.println("Báo cáo số lượng ca mắc (Sắp xếp theo tên):");
        for (Map.Entry<String, Integer> entry : thongKeBenh.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}