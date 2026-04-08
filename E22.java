import java.util.ArrayDeque;
import java.util.Deque;
public class E22{
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Element 1");
        deque.addLast("Element 2");
        deque.addFirst("Element 0");
        System.out.println("Deque: " + deque);
        String first = deque.removeFirst();
        String last = deque.removeLast();
        System.out.println("Removed First: " + first);
        System.out.println("Removed Last: " + last);
        System.out.println("Deque after removals: " + deque);
    }
}