class Vehicle
{
    void start()
    {
        System.out.println("vehicle starts ");
    }
    void start(String mode)
    {
        System.out.println("vehicle is starting in " + mode + " mode");
    }
    class Car extends Vehicle
    {

        void start()
        {
            System.out.println("car is starting");
        }

        void fuel()
        {
            System.out.println("car is uses petrol");
        }

    }
}
public class E5
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        v.start();
        v.start("eco");
        Vehicle.Car c = v.new Car();
        c.start();
        c.fuel();
    }
}