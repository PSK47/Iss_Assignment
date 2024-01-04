import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);

            int[] numbers = {1, 2, 3};
            System.out.print("Enter an index to get the corresponding number: ");
            int index = scanner.nextInt();
            int value = getArrayElement(numbers, index);
            System.out.println("Value at index " + index + ": " + value);

            System.out.print("Enter a positive number: ");
            int positiveNumber = scanner.nextInt();
            validatePositiveNumber(positiveNumber);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index for array access.");
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            System.out.println("Finally block: This code always runs, regardless of exceptions.");
            scanner.close();
        }
    }

    private static int divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }

    private static int getArrayElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        return array[index];
    }

    private static void validatePositiveNumber(int number) throws CustomException {
        if (number <= 0) {
            throw new CustomException("Number must be positive.");
        }
        System.out.println("Valid positive number: " + number);
    }
}
