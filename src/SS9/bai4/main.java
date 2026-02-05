package SS9.bai4;

public class main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        System.out.println("Calling common methods via Animal reference:");
        animal.sound(); 
        animal.eat(); 

       
        System.out.println("\nDowncasting safely with instanceof:");
        if (animal instanceof Dog) {
            Dog d = (Dog) animal; 
            d.fetch();
        }

        System.out.println("\nUnsafe cast example (may throw ClassCastException):");
        try {
            Dog d2 = (Dog) animal;
            d2.fetch();
        } catch (ClassCastException ex) {
            System.out.println("Cast failed: " + ex.getMessage());
        }
    }
}
