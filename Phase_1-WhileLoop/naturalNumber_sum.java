// 6. Calculate and print the sum of the first n natural numbers.

public class naturalNumber_sum {
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the sum of first n natural numbers
        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}