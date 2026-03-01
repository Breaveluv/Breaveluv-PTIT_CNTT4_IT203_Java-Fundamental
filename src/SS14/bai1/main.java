package SS14.bai1;

import java.util.LinkedHashSet;
import java.util.Set;

public class main {
    public static void main(String[] args){
        String[] input = {
            "Nguyễn Văn A – Yên Bái", 
            "Trần Thị B – Thái Bình", 
            "Nguyễn Văn A – Yên Bái", 
            "Lê Văn C – Hưng Yên"
        };
        Set<String> danhsachbenhnhan = new LinkedHashSet<>();

        for(String ten : input){
            danhsachbenhnhan.add(ten);
        }
        System.out.println("Danh sach goi kham: ");
        int i =0;
        for(String ten : danhsachbenhnhan){
            System.out.println(i+" "+ ten);
            i++;
        }
    }
}
