public class E30{
class Test extends Thread{
    public void run(){
        System.out.println("Running...");
    }
        public static void main(String [] args){
            Test t = new Test();
            t.start();
             System.out.println("Main Thread...");
        }
    }
}