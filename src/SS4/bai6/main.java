package SS4.bai6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String[] args) {

        String review = "Quyen sach nay rat hay nhung noi dung co mot so cho rat te "
                + "va cach trinh bay hoi xau. Tac gia viet kha dai dong nen doc "
                + "lau se cam thay hoi met, nhung tong the van dang doc cho sinh vien.";

        
        String[] blacklist = {"ngu", "xau", "te", "doan"};

       
        for (String badWord : blacklist) {
            String regex = "(?i)\\b" + badWord + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(review);

            StringBuilder result = new StringBuilder();

            while (matcher.find()) {
                String stars = "*".repeat(matcher.group().length());
                matcher.appendReplacement(result, stars);
            }
            matcher.appendTail(result);
            review = result.toString();
        }

       
        if (review.length() > 200) {
            int cutIndex = review.lastIndexOf(" ", 200);

            if (cutIndex == -1) {
                cutIndex = 200;
            }

            StringBuilder shortReview = new StringBuilder();
            shortReview.append(review.substring(0, cutIndex));
            shortReview.append("...");

            review = shortReview.toString();
        }

        
        System.out.println("Noi dung danh gia sau khi xu ly:");
        System.out.println(review);
    }
}
