
import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Job Roles:\n1.Manager\n2.Developer\n3.Intern\nEnter choice:");
        int ch = sc.nextInt();
        System.out.print("Enter Experience (in yrs): ");
        int exp = sc.nextInt();
        if(ch==1){
            if(exp < 3){
                System.out.println("----No bonus---\nSalary : "+50000);
            }
            else if(exp <= 5){
                System.out.println("Bonus: "+50000*0.1);
                System.out.println("Salary : "+(50000+(50000*0.1)));
            }
            else{
                System.out.println("Bonus: "+50000*0.2);
                System.out.println("Salary : "+(50000+(50000*0.2)));
            }
        }
        else if(ch==2){
            if(exp < 3){
                System.out.println("----No bonus---\nSalary : "+30000);
            }
            else if(exp <= 5){
                System.out.println("Bonus: "+30000*0.1);
                System.out.println("Salary : "+(30000+(30000*0.1)));
            }
            else{
                System.out.println("Bonus: "+30000*0.2);
                System.out.println("Salary : "+(30000+(30000*0.2)));
            }
        }
        else if(ch==3) {
            if(exp < 3){
                System.out.println("----No bonus---\nSalary : "+15000);
            }
            else if(exp <= 5){
                System.out.println("Bonus: "+15000*0.1);
                System.out.println("Salary : "+(15000+(15000*0.1)));
            }
            else{
                System.out.println("Bonus: "+15000*0.2);
                System.out.println("Salary : "+(15000+(15000*0.2)));
            }
        }
        else{
            System.out.println("Invalid !!");
        }
        sc.close();
    }
}