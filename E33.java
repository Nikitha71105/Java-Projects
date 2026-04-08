public class E33 extends Thread{
    public static int amount = 0;
    public static void main(String[] args){
        E33 thread = new E33();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
