import java.util.Scanner;

public class StringArrayExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String example
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Array example
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Loop control
        System.out.println("Printing numbers from 1 to 5 using a loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Decision-making
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println(userNumber + " is even.");
        } else {
            System.out.println(userNumber + " is odd.");
        }
    }
}

