// 14. Find and print the sum of digits of the given number.

public class digitSum {
    public static void main(String[] args) {
        int number = 12345; // You can change this value to find the sum of digits of a different number
        int sum = 0;
        int n = number;

        while (n >= 1) {
            int digit = n % 10; // Get the last digit
            sum += digit; // Add it to the sum
            n /= 10; // Remove the last digit from the original number
        }

        System.out.println("The sum of digits in " + number + " is: " + sum);
    }
}
