package SS9.bai2;

public class main {
    public static void Main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        System.out.println("a1 ->");
        a1.sound();
        System.out.println("a2 ->");
        a2.sound();
        System.out.println("a3 ->");
        a3.sound();

        // Direct instances
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();
    }
}
