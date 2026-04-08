interface Animal {
    void sound();
}

public class E23 {
    public static void main(String[] args) {
        Animal obj  = () -> System.out.println("Dog barks");
        obj.sound();
    }

}