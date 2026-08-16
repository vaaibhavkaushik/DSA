// 5. Print the multiplication table of a given number from n × 1 to n × 10.
public class multiplicationTable {
    public static void main(String[] args){
        int n=7;
        int i=1;
        while(i<=10){
            System.out.println(n + "x" + i + "=" + (n*i));
            i++;
        }
    }
}
