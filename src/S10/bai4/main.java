package S10.bai4;

interface RemoteControl {
    void powerOn();

    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}

public class main {
    public static void main(String[] args) {
      
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        // Gọi các phương thức
        smartLight.powerOn();
        smartLight.checkBattery();
    }
}
