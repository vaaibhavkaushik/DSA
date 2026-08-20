// 9. Calculate and print the factorial of a given number.

public class factorial {
    public static void main(String[] args) {
        int n = 5; // You can change this value to calculate the factorial of a different number
        int factorial = 1;
        int i = 1;

        while(i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of " + n + " is: " + factorial);
    }
    
}
