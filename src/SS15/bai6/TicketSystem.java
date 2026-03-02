package SS15.bai6;

import java.util.LinkedList;
import java.util.Queue;

class Ticket {
    int ticketNumber;
    String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }
}

public class TicketSystem {
    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;

    public void issueTicket(String time) {
        currentNumber++;
        ticketQueue.add(new Ticket(currentNumber, time));
        System.out.println("Đã phát số thứ tự: " + currentNumber);
    }

    public void callNext() {
        Ticket t = ticketQueue.poll();
        if (t != null) {
            System.out.println("Mời số: " + t.ticketNumber + " vào quầy tiếp đón.");
        } else {
            System.out.println("Hết số chờ.");
        }
    }
}