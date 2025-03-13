import java.util.Scanner;
public class eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Maths: ");
        int maths = sc.nextInt();
        System.out.print("Enter marks of Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks of Chemistry: ");
        int chemistry = sc.nextInt();
        int total = maths+physics+chemistry;
        int mathsphysics = maths+physics;
        System.out.println("Total marks: "+total);
        System.out.println("Marks of maths + physics: "+mathsphysics);

        if(maths>=60 && physics>=50 && chemistry>=40 && total>=200){
            System.out.println("----You are eligible----");
        }else if(maths+physics>=150){
            System.out.println("----You are eligible----");
        }else{
            System.out.println("----You are not eligible----");
        }
        
        sc.close();
    }
}
