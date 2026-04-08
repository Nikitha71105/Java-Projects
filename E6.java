class Bank1
{
void interest(int amount)
{
    System.out.println("interest is " +(amount * 5/100));

}
void interest(int amount, double rate)
{
    System.out.println("interest is " +(amount * rate/100));
}
void display()
{
    System.out.println("welcome to bank");
}
}
class SBI extends Bank1
{
    void display()
    {
        System.out.println("welcome to SBI");
    }
}
public class E6
{
    public static void main(String args[])
    {
        Bank1 b = new SBI();
        b.display();
        b.interest(50000);
        b.interest(50000, 6.5);
    }
}