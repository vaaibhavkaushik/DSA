// 4. Print all odd numbers between 1 and 100.

public class printNumber_odd {
    public static void main(String[] args){
        int n=1;
        while(n<=100) {
            if(n%2!=0)
                System.out.println(n);
            n++;
        }
    }
}
