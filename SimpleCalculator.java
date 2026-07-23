import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Welcome to the Custom Calculator ---");
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        double sum = add(num1, num2);
        double difference = subtract(num1, num2);

        System.out.print("\n--- Result ---");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);   
        
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));

        input.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        double result = a - b;
        return result;
    }

    public static double multiply(double a, double b) {
        return a*b;
    }
}
