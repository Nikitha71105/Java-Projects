import java.util.*;
public class E18{
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        System.out.println("Value of  key 2:  " + map.get(2));
        map.remove(1);
        System.out.println("Map: " + map);
        System.out.println("Contains key 4: " + map.containsKey(4));
    }
}