class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
public class E11 {
    public static void main(String [] args){
        try {
            
         throw new MyException("Custom Error");
    }
catch(MyException e);
    System.out.println(e.getMessage());
}
}