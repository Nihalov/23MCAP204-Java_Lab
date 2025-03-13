import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int k = num;
        int rem, res=0;
        int digits = 0;

        int temp = num;
        while(temp>0){
            temp/=10;
            digits++;
        }

        while(k!=0){
            rem=k%10;
            res+=Math.pow(rem, digits);
            k/=10;
        }
        
        if(res==num)
            System.out.println(num+" is armstrong");
        else{
            System.out.println(num+" is not armstrong");
        }
        sc.close();
    }
}
