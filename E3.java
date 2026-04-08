class Calculator
{
        int add(int a , int b)
    {
        System.out.println("Addition:" +(a+b));
        return a + b;
    }

        int Sub(int p, int q)
    {
    System.out.println("Subtraction :" +(p-q));
    return p - q;
    }
    double degreetoRadian (double x)
    {
    System.out.println("Degrees to Radians: " + Math.sin(Math.toRadians(x)));
    return Math.sin(Math.toRadians(x));
    }
    double radiantoDegree (double y)
    {
    System.out.println("Radians to Degrees: " + Math.toDegrees(y));
    return Math.toDegrees(y);
    }

    void show()
    {
        System.out.println("This is a calculator");
    }
}
class ScientificCalculator extends Calculator
{
        void show()
        {
            System.out.println("this is scientific calculator");
        }
}

public class E3
{
    public static void main(String args[])
    {
        Calculator c = new ScientificCalculator();
        c.show();
        c.add(10,20);
        c.Sub(30,10);
        c.degreetoRadian(180);
        c.radiantoDegree(0.5);
    }
}