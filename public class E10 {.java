public class E10 {
    static void method1{
        int a = 10 / 0;
    }
    static void method2(){
        method1();
    }
    public static void main(String[] args){
        try{
            method2();
        }
        catch (Exception e){
            System.out.println("Handled in main");
        }
}
}
