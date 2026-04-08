class MyDaemon extends Thread{
    public void run(){
        while(true){
            System.out.println("Daemon thread running...");
        }
    }
    public static void main(String[] args){
        MyDaemon t = new MyDaemon();
        t.setDaemon(true);
        t.start();
        System.out.println("Main thread finished");
    }
}