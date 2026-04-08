class Payment
{
    void pay()
    {
        System.out.println("payment is done");
    }

    void pay(String method)
    {
        System.out.println("payment is done using " + method);
    }

    class SmartPayment extends Payment
    {
        void pay()
        {
            System.out.println("smart payment is successful");
        }

        void cashback()
        {
            System.out.println("cashback is received");
        }
    }
}

public class E7
{
    public static void main(String[] args)
    {
        Payment p = new Payment();
        p.pay();
        p.pay("UPI");

        Payment.SmartPayment s = p.new SmartPayment();
        s.pay();
        s.cashback();
    }
}