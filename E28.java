import java.util.*;
import java.util.stream.*;
public class E28{
public static void main(String[] args) {
    List<Integer>Is=Arrays.asList(4,7,5,3,6);
    Stream<Integer>dataStream = Is.stream();
    long evenNumbers = dataStream.filter(n->n%2 == 0).count();
    System.out.println( evenNumbers);
    }
}