package C01;
import java.util.Scanner;

public class numPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int k = num;
        int res = 0;

        while (num != 0) {
            int digit = num % 10;
            res = res * 10 + digit;  
            num /= 10;                        
        }
        if (k == res) {
            System.out.println(k + " is a palindrome.");
        } else {
            System.out.println(k + " is not a palindrome.");
        }

        sc.close();
    }
}
