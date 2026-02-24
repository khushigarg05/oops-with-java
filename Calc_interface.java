// First interface for basic operations
interface BasicOperations {
    int add(int a, int b);
    int subtract(int a, int b);
}

// Second interface for advanced operations
interface AdvancedOperations {
    int multiply(int a, int b);
    double divide(int a, int b);
}

// Calculator class implements both interfaces
class Calculator implements BasicOperations, AdvancedOperations {

    // Implementing BasicOperations methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Implementing AdvancedOperations methods
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
}

// Main class to test the calculator
public class Calc_interface{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}