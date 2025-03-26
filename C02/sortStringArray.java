package C02;
import java.util.Arrays;
import java.util.Scanner;
public class sortStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();//for consuming the leftover newline from nextInt

        String[] words = new String[n];
        System.out.println("Enter strings");

        for(int i=0;i<n;i++){
            words[i] = sc.nextLine();
        }

        Arrays.sort(words);
        
        for(String word : words){
            System.out.print(word+" ");
        }
        sc.close();
    }
}
