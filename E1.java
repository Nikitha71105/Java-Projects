class Shape {
    void area(int a){
        System.out.println("Square area: "+ (a * a));
    }
    void area(int l,int b){
        System.out.println("Rectangle area: "+ (l * b));
    }
}
public class E1{
    public static void main(String[] args) {
        Shape s= new Shape();
        s.area(5);
        s.area(5,10);
    }
}