// 8. Calculate the sum of all odd numbers from 1 up to n.
public class oddNumber_sum {
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the sum of first n odd numbers
        int sum = 0;
        int i = 1;

        while(i <= n) {
            if(i % 2 != 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("The sum of the first " + n + " odd numbers is: " + sum);
    }
    
}
