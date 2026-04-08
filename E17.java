import java.util.*;
public class E17{
    public static void main(String[] args){
        HashSet<String> Set = new HashSet<>();
        Set.add("Java");
        Set.add("Python");
        Set.add("C++");
        Set.add("Java"); 
        System.out.println("Set Elements: " + Set);
    }
}