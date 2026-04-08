public class E34 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        E34 thread = new E34();
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Waiting ...");
        }
        System.out.println("Main:" + amount);
        amount++;
        System.out.println("Main:" + amount);
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        amount++;
        System.out.println("Thread:" + amount);
    }
}