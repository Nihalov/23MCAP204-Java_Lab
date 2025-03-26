package C02;
import java.util.Scanner;
public class stringPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean isPal = true;
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                isPal =false;
                break;
            }
        }
        if(isPal){
            System.out.println(word+" is palindrome");
        }
        else{
            System.out.println(word+" is not palindrome");
        }
        sc.close();
    }
}
