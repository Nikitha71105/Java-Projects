import java.util.ArrayList;
import java.util.Collections;
public class E16{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        Collections.sort(cars,Collections.reverseOrder());
        for (String i : cars){
            System.out.println(i);
        }
    }
}