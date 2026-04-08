class A extends Thread{
    @Override
    public void run(){
        for (int i = 0;i<=25;i++){
            System.out.println("Hello");
        }
    }
}
class B extends Thread{
    @Override
    public void run(){
        for (int i = 0;i<=50;i++){
            System.out.println("Hello Java");
        }
    }
}
public class E32 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}