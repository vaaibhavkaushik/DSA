// 7. Calculate the sum of all even numbers from 1 up to n.

public class evenNumber_sum {
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the sum of first n even numbers
        int sum = 0;
        int i = 2;

        while(i <= n) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
    }
}
