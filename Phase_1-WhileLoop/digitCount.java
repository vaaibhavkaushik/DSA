// 11. Count and print the total number of digits in a given number.

public class digitCount {
    public static void main(String[] args) {
        int number = 7814; // You can change this value to count the digits of a different number
        int count = 0;
        int n = number;
        int d;

        while(n >= 1) {
            d = n % 10; // Get the last digit
            count++; // Increment the count
            n /= 10; // Remove the last digit
        }

        System.out.println("The total number of digits in " + number + " is: " + count);
    }
}
