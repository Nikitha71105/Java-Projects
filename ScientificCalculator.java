import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sine");
            System.out.println("6. Cosine");
            System.out.println("7. Tangent");
            System.out.println("8. Natural Log");
            System.out.println("9. Square Root");
            System.out.println("10. Power");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 11) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b != 0) System.out.println("Result: " + (a / b));
                    else System.out.println("Cannot divide by zero");
                    break;
                case 5:
                    System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    System.out.println("Result: " + Math.sin(Math.toRadians(angle)));
                    break;
                case 6:
                    System.out.print("Enter angle in degrees: ");
                    angle = sc.nextDouble();
                    System.out.println("Result: " + Math.cos(Math.toRadians(angle)));
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    angle = sc.nextDouble();
                    System.out.println("Result: " + Math.tan(Math.toRadians(angle)));
                    break;
                case 8:
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    if (num > 0) System.out.println("Result: " + Math.log(num));
                    else System.out.println("Invalid input for log");
                    break;
                case 9:
                    System.out.print("Enter number: ");
                    num = sc.nextDouble();
                    if (num >= 0) System.out.println("Result: " + Math.sqrt(num));
                    else System.out.println("Invalid input for square root");
                    break;
                case 10:
                    System.out.print("Enter base and exponent: ");
                    double base = sc.nextDouble();
                    double exp = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exp));
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}