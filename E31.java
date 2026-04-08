class Test{
    synchronized void display(){
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
    public class E31 {
        public static void main(String[] args) {
            Test obj = new Test();
            Thread t1 = new Thread(() -> obj.display());
            Thread t2 = new Thread(() -> obj.display());
            t1.start();
            t2.start();
        }
    }