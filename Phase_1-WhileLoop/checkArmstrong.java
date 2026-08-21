// 15. Check whether the given number is an Armstrong number.

public class checkArmstrong {
    public static void main(String[] args) {
        int number = 1634; // You can change this value to check a different number
        int originalNumber = number;
        int dup = number;
        int sum = 0;
        int count = 0;

         while (dup >= 1) {
            int d = dup % 10; // Get the last digit
            count++; // Count the number of digits
            dup /= 10; // Remove the last digit from the duplicate number
        }

//number = originalNumber; // Reset the number to the original value

        while (number >= 1) {
            int digit = number % 10; // Get the last digit
            sum += (int) Math.pow(digit, count); // Add the power of the digit to the sum
            number /= 10; // Remove the last digit from the original number
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
