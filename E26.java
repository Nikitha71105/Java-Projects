import java.util.*;

// Functional Interface
interface BillCalculator {
    double calculate(double amount);
}

public class E26 {
    public static void main(String[] args) {

        // List of order amounts
        List<Double> orders = Arrays.asList(250.0, 500.0, 1000.0, 150.0);

        // Lambda for GST (18%)
        BillCalculator gst = amount -> amount + (amount * 0.18);

        // Lambda for Discount (10%)
        BillCalculator discount = amount -> amount - (amount * 0.10);

        // Lambda for Delivery Charge (₹50 if amount < 500)
        BillCalculator delivery = amount -> (amount < 500) ? amount + 50 : amount;

        // Lambda for Service Charge (2%)
        BillCalculator service = amount -> amount + (amount * 0.02);

        double totalBill = 0;
        int count = 1;

        System.out.println("===== ONLINE FOOD BILL =====");

        // Process each order
        for (double order : orders) {

            double afterGST = gst.calculate(order);
            double afterDiscount = discount.calculate(afterGST);
            double afterDelivery = delivery.calculate(afterDiscount);
            double finalAmount = service.calculate(afterDelivery);

            System.out.println("\nOrder " + count++);
            System.out.println("Original Amount  : " + order);
            System.out.println("After GST (18%)  : " + afterGST);
            System.out.println("After Discount   : " + afterDiscount);
            System.out.println("After Delivery   : " + afterDelivery);
            System.out.println("Final Bill       : " + finalAmount);

            totalBill += finalAmount;
        }

        System.out.println("\n============================");
        System.out.println("Total Bill for All Orders: " + totalBill);
    }
}