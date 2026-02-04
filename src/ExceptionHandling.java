public class ExceptionHandling {

    // Custom exception class
    static class InvalidUserException extends Exception {
        @Override
        public String getMessage() {
            return "Invalid credentials - Authentication failed";
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Exception Handling Examples ===\n");

        // Example 1: ArithmeticException
        System.out.println("1. ArithmeticException Example:");
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            System.out.println("Exception Type: " + e.getClass().getSimpleName());
        }
        System.out.println();

        // Example 2: ArrayIndexOutOfBoundsException
        System.out.println("2. ArrayIndexOutOfBoundsException Example:");
        try {
            int[] arr = {12, 22, 15, 20};
            System.out.print("Array elements: ");
            for (int i = 0; i <= arr.length; i++) {  // Intentional error
                System.out.print(arr[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: Array index out of bounds");
            System.out.println("Exception Type: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Finally block: Array processing completed");
        }
        System.out.println();

        // Example 3: NullPointerException
        System.out.println("3. NullPointerException Example:");
        try {
            String str = null;
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot perform operation on null object");
            System.out.println("Exception Type: " + e.getClass().getSimpleName());
        }
        System.out.println();

        // Example 4: NumberFormatException
        System.out.println("4. NumberFormatException Example:");
        try {
            String numStr = "abc123";
            int num = Integer.parseInt(numStr);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
            System.out.println("Exception Type: " + e.getClass().getSimpleName());
        }
        System.out.println();

        // Example 5: Custom Exception (InvalidUserException)
        System.out.println("5. Custom Exception Example:");
        try {
            authenticateUser(12345, 12345, 1234, 5678);
        } catch (InvalidUserException e) {
            System.out.println("Authentication Error: " + e.getMessage());
        }
        System.out.println();

        // Example 6: Multiple Exceptions
        System.out.println("6. Multiple Exception Handling:");
        handleMultipleExceptions(2);  // Try with 0, 1, 2 for different scenarios
        System.out.println();

        // Example 7: Nested Try-Catch
        System.out.println("7. Nested Try-Catch Example:");
        nestedTryCatch();

        System.out.println("\n=== All Examples Completed ===");
    }

    // Method to demonstrate custom exception
    static void authenticateUser(int acc_no, int id, int pin, int pwd) throws InvalidUserException {
        if (acc_no == id && pin == pwd) {
            System.out.println("Authentication successful - Collect your money");
        } else {
            throw new InvalidUserException();
        }
    }

    // Method to demonstrate multiple exception types
    static void handleMultipleExceptions(int choice) {
        try {
            switch (choice) {
                case 0:
                    int result = 10 / 0;  // ArithmeticException
                    break;
                case 1:
                    String str = null;
                    str.length();  // NullPointerException
                    break;
                case 2:
                    int[] arr = new int[3];
                    arr[5] = 10;  // ArrayIndexOutOfBoundsException
                    break;
                default:
                    System.out.println("No exception triggered");
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot access null object");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index");
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
    }

    // Method to demonstrate nested try-catch
    static void nestedTryCatch() {
        try {
            System.out.println("Outer try block");
            try {
                System.out.println("Inner try block");
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic error handled");
            }

            // This will cause exception in outer try
            String str = null;
            str.length();

        } catch (NullPointerException e) {
            System.out.println("Outer catch: Null pointer error handled");
        } finally {
            System.out.println("Outer finally: Cleanup completed");
        }
    }
}