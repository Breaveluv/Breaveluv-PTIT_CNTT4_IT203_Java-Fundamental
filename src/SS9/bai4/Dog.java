package SS9.bai4;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog: Woof!");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}
