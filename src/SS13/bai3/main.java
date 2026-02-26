package SS13.bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {

  
    public static <T> void findCommonPatients(List<T> listA, List<T> listB) {
      
        Set<T> setA = new HashSet<>(listA);
        List<T> common = new ArrayList<>();

        for (T item : listB) {
          
            if (setA.contains(item)) {
                common.add(item);
            }
        }

       
        System.out.println(common);
    }

    public static void main(String[] args) {
       
        List<Integer> khoaNoiInt = Arrays.asList(101, 102, 105);
        List<Integer> khoaNgoaiInt = Arrays.asList(102, 105, 108);
        
        System.out.print("Test Case 1 (Integer) Output: ");
        findCommonPatients(khoaNoiInt, khoaNgoaiInt);


       
        List<String> khoaNoiStr = Arrays.asList("DN01", "DN02", "DN03");
        List<String> khoaNgoaiStr = Arrays.asList("DN02", "DN04");
        
        System.out.print("Test Case 2 (String) Output: ");
        findCommonPatients(khoaNoiStr, khoaNgoaiStr);
    }
}