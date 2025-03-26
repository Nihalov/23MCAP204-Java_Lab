package C02;
import java.util.Scanner;
public class vowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text:");
        String word = sc.nextLine();
        int vowelCount = 0;
        int consonentCount = 0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
            else if(ch==' '){
                //does nothing
            }
            else{
                consonentCount++;
            }
        }
        System.out.println("Vowel count: "+vowelCount);
        System.out.println("Consonent count: "+consonentCount);

        sc.close();
    }
}