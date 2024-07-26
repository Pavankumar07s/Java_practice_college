import java.util.*;

public class Complex {
    int operand1;
    int operand2;
    String operator;

    // Default constructor
    public Complex() {
        operand1 = 0;
        operand2 = 0;
        operator = "Unspecified";
    }

    // Parameterized constructor
    public Complex(int operand1, int operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public void display() {
        System.out.println(
                "Operand1: " + this.operand1 + ", Operand2: " + this.operand2 + ", Operator: " + this.operator);
    }

    public int operation() {
        switch (this.operator) {
            case "+":
                return this.operand1 + this.operand2;
            case "-":
                return this.operand1 - this.operand2;
            case "*":
                return this.operand1 * this.operand2;
            case "/":
                if (this.operand2 != 0) {
                    return this.operand1 / this.operand2;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0; // or throw an exception
                }
            default:
                System.out.println("No operation selected");
                return 0; // or throw an exception
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operand that you want to operate :");
        String operator = scanner.nextLine();
        System.out.println("Enter the operand 1 :");
        int operand1 = scanner.nextInt();
        System.out.println("Enter the operand 2 :");
        int operand2 = scanner.nextInt();
        Complex calc1 = new Complex();
        Complex calc2 = new Complex(operand1, operand2, operator);

        calc1.display();
        System.out.println("Result: " + calc1.operation());

        calc2.display();
        System.out.println("Result: " + calc2.operation());
        scanner.close();
    }
}
