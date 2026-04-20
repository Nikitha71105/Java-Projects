class Testing extends Thread{
    public void run(){
        System.out.println("Running...");
    }
        public static void main(String [] args){
            Testing t = new Testing();
            t.start();
        }
    }