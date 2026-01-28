package SS4.bai3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class main {

    static class Transaction {
        String bookId;
        LocalDate borrowDate;

        Transaction(String bookId, LocalDate borrowDate) {
            this.bookId = bookId;
            this.borrowDate = borrowDate;
        }

        public String toString() {
            return "Ma sach: " + bookId + ", Ngay muon: " + borrowDate;
        }
    }

    public static void man(String[] args) {

        int n = 100_000; // số lượng giao dịch lớn
        List<Transaction> transactions = new ArrayList<>();

       
        for (int i = 1; i <= n; i++) {
            transactions.add(new Transaction("BOOK" + i, LocalDate.now()));
        }

       
        long startPlus = System.currentTimeMillis();

        String reportPlus = "Thoi gian he thong: " + LocalDateTime.now() + "\n";
        for (Transaction t : transactions) {
            reportPlus = reportPlus + t + "\n";
        }

        long endPlus = System.currentTimeMillis();

     
        long startBuilder = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append("Thoi gian he thong: ")
          .append(LocalDateTime.now())
          .append("\n");

        for (Transaction t : transactions) {
            sb.append(t).append("\n");
        }

        String reportBuilder = sb.toString();

        long endBuilder = System.currentTimeMillis();

       
        System.out.println("Thoi gian dung toan tu +: " + (endPlus - startPlus) + " ms");
        System.out.println("Thoi gian dung StringBuilder: " + (endBuilder - startBuilder) + " ms");
    }
}
