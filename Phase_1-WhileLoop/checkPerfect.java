// 16. Check whether the given number is a Perfect number.

public class checkPerfect {
    public static void main(String[] args) {
        int num = 7; // Example number to check
        int sum = 0;
        int i = 1;
        while (i < num-1) {
            if (num % i == 0) {
                sum += i;   
    }
    i++;
}
        if (sum == num) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }
    }
}
