public class Calculator {
    // Private attribute to store the last result
    private double lastResult;

    // Constructor
    public Calculator() {
        this.lastResult = 0.0;
    }

    // Method to add two numbers
    public double add(double a, double b) {
        lastResult = a + b;
        return lastResult;
    }

    // Method to subtract two numbers
    public double subtract(double a, double b) {
        lastResult = a - b;
        return lastResult;
    }

    // Method to multiply two numbers
    public double multiply(double a, double b) {
        lastResult = a * b;
        return lastResult;
    }

    // Method to divide two numbers
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        lastResult = a / b;
        return lastResult;
    }

    // Getter method for encapsulation
    public double getLastResult() {
        return lastResult;
    }

    // Method to clear history
    public void clearHistory() {
        lastResult = 0.0;
    }

    // Main method for testing
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 5));        // 15.0
        System.out.println(calc.subtract(20, 8));   // 12.0
        System.out.println(calc.multiply(4, 7));    // 28.0
        System.out.println(calc.divide(100, 4));    // 25.0

        System.out.println("Last Result: " + calc.getLastResult()); // 25.0

        calc.clearHistory();
        System.out.println("After clear: " + calc.getLastResult()); // 0.0
    }
}