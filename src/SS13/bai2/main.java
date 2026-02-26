package SS13.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {

    
    public static List<String> xuLyKhoThuoc(List<String> danhSachGoc) {
      
        Set<String> setLọc = new HashSet<>(danhSachGoc);

      
        List<String> danhSachDuyNhat = new ArrayList<>(setLọc);

      
        Collections.sort(danhSachDuyNhat);

        return danhSachDuyNhat;
    }

    public static void main(String[] args) {
       
        List<String> input = Arrays.asList(
            "Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"
        );

      
        List<String> ketQua = xuLyKhoThuoc(input);

      
        System.out.println("Kết quả sau khi lọc và sắp xếp:");
        System.out.println(ketQua);
    }
}