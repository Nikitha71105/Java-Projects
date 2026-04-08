class Shape
{
        void area (int a)
    {
        System.out.println("Square Area :" +(a*a));
    }

void area (int l, int b)
{
    System.out.println("Rectangle Area :" +(l*b));
}
    void display()
    {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape
{
        void display()
        {
            System.out.println("this is circle");
        }
}

public class E2
{
    public static void main(String args[])
    {
        Shape s = new Circle();
        s.display();
        s.area(5);
        s.area(4,6);
    }
}