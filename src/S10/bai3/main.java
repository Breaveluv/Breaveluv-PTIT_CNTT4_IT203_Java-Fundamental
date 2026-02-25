package S10.bai3;

public class main {
    public static void main(String[] args) {
        Duck donald = new Duck("Vịt Donald");
        Fish nemo = new Fish("Cá Nemo");

        System.out.println("--- Hành động của Vịt ---");
        donald.swim();
        donald.fly();

        System.out.println("\n--- Hành động của Cá ---");
        nemo.swim();
      
    }
}