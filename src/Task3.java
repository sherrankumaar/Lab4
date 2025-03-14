import java.util.Scanner;

public class Task3 {
    private static class TwoNumberOperationInput {
        int dec1;
        int dec2;
        int resultBase;
    }

    private static TwoNumberOperationInput readTwoNumbers(Scanner sc) {
        TwoNumberOperationInput input = new TwoNumberOperationInput();

        System.out.print("Enter the base of the numbers (2,3,4,5,6,8,9,10,16): ");
        int base = sc.nextInt();

        System.out.print("Enter the first number: ");
        String num1 = sc.next();

        System.out.print("Enter the second number: ");
        String num2 = sc.next();
        input.dec1 = toDecimal(num1, base);
        input.dec2 = toDecimal(num2, base);

        System.out.print("Enter the target base for the result (2,3,4,5,6,8,9,10,16): ");
        input.resultBase = sc.nextInt();

        return input;
    }
    public static int toDecimal(String number, int base) {
        try {
            return Integer.parseInt(number, base);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for base " + base + ": " + number);
            return 0;
        }
    }
    public static String fromDecimal(int number, int base) {
        return Integer.toString(number, base).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;

        do {
            System.out.println("\n----- Number System Converter Menu -----");
            System.out.println("A - Convert from a given base to decimal");
            System.out.println("B - Convert from decimal to a given base");
            System.out.println("C - Addition of two numbers in any base");
            System.out.println("D - Subtraction of two numbers in any base");
            System.out.println("E - Multiplication of two numbers in any base");
            System.out.println("F - Division of two numbers in any base (integer division)");
            System.out.println("W - Exit the program");
            System.out.print("Choose an option: ");
            option = Character.toUpperCase(sc.next().charAt(0));

            switch (option) {
                case 'A': {
                    System.out.print("Enter the base of the number (2,3,4,5,6,8,9,10,16): ");
                    int base = sc.nextInt();
                    System.out.print("Enter the number: ");
                    String num = sc.next();
                    int decimalValue = toDecimal(num, base);
                    System.out.println("Decimal equivalent: " + decimalValue);
                    break;
                }
                case 'B': {
                    System.out.print("Enter a decimal number: ");
                    int decimalValue = sc.nextInt();
                    System.out.print("Enter the target base (2,3,4,5,6,8,9,10,16): ");
                    int base = sc.nextInt();
                    String result = fromDecimal(decimalValue, base);
                    System.out.println("Number in base " + base + ": " + result);
                    break;
                }
                case 'C': {
                    TwoNumberOperationInput input = readTwoNumbers(sc);
                    int sum = input.dec1 + input.dec2;
                    String result = fromDecimal(sum, input.resultBase);
                    System.out.println("Sum in base " + input.resultBase + ": " + result);
                    break;
                }
                case 'D': {
                    TwoNumberOperationInput input = readTwoNumbers(sc);
                    int difference = input.dec1 - input.dec2;
                    String result = fromDecimal(difference, input.resultBase);
                    System.out.println("Difference in base " + input.resultBase + ": " + result);
                    break;
                }
                case 'E': {
                    TwoNumberOperationInput input = readTwoNumbers(sc);
                    int product = input.dec1 * input.dec2;
                    String result = fromDecimal(product, input.resultBase);
                    System.out.println("Product in base " + input.resultBase + ": " + result);
                    break;
                }
                case 'F': {
                    TwoNumberOperationInput input = readTwoNumbers(sc);

                    if (input.dec2 == 0) {
                        System.out.println("Error: Division by zero.");
                    } else {
                        int quotient = input.dec1 / input.dec2;
                        String result = fromDecimal(quotient, input.resultBase);
                        System.out.println("Quotient in base " + input.resultBase + ": " + result);
                    }
                    break;
                }
                case 'W': {
                    System.out.println("Exiting the program...");
                    break;
                }
                default: {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        } while (option != 'W');

        sc.close();
    }
}
