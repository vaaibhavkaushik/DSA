// 13. Check whether the given number is a palindrome.

public class checkPalindrome {
    public static void main(String[] args) {
        int number = 125; // You can change this value to check a different number
        int originalNumber = number;
        int reversedNumber = 0;

        while (number >= 1) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
