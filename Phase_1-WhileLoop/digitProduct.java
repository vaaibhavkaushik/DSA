// 10. Find and print the product of all digits of a given number.

public class digitProduct {
    public static void main(String[] args) {
        int number = 1234; // You can change this value to calculate the product of digits of a different number
        int product = 1;
        int n = number;

        while(n >= 1) {
            int digit = n % 10; // Get the last digit
            product *= digit; // Multiply the digit to the product
            n /= 10; // Remove the last digit
        }

        System.out.println("The product of all digits of " + number + " is: " + product);
    }
    
}
