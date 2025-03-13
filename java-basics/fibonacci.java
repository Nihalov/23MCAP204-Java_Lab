package C01;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();
        int a=0, b=1;
        int nxt=1;
        System.out.print("Fibonacci series: ");
        for(int i=0;a<=num;i++){
            System.out.print(a+" ");
            nxt = a + b;
            a=b;
            b=nxt;
        }
        sc.close();
    }
}
