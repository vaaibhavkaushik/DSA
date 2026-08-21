// 12. Reverse the given number and print the reversed value.

public class numberReverse {
    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = 0;

        while (num >= 1) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append it to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNum);
    }
    
}
