package C01;
import java.util.Scanner;

class StudentClass{
    int studentId;
    String name;
    double marks;

    StudentClass(int studentId, String name, double marks){
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails(){
        System.out.println("\n----Student Details----");
        System.out.println("StudentId: "+studentId);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }

    boolean isPassed(){
        if (marks>=40){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Id: ");
        int studentId = sc.nextInt();
        sc.nextLine();//for consuming the leftover newline from nextInt
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        StudentClass st = new StudentClass(studentId, name, marks);
        st.displayDetails();
        if(st.isPassed()){
            System.out.println("----Congratulations! You Passed----");
        }else{
            System.out.println("----Failed! Better luck next time----");
        }
        
        sc.close();
    }
}
