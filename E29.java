import java.util.*;
public class E29{
    public static void main(String[] args) {
     List<Integer>numbers=Arrays.asList(9,8,7,5,6);
     System.out.println("Sequential Stream:");
     numbers.stream()
     .forEach(n->System.out.println(Thread.currentThread().getName()+ " - " + n));
     System.out.println("\nParallel Stream:");
     numbers.parallelStream()
     .forEach(n->System.out.println(Thread.currentThread().getName() + " - " + n));
}
}