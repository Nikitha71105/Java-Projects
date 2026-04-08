@FunctionalInterface
interface sample{
    void display(int i , int j);
}
public class E25{
    public static void main(String[] args){
        sample obj = (i,j)-> System.out.println("Hii" + i*j);
        obj.display(15,3);
    }
}