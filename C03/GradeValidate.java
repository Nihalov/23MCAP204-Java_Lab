package C03;
import java.util.Scanner;

class InvalidGradeException extends Exception{
    InvalidGradeException(String msg){
        super(msg);
    }
}

public class GradeValidate {
    public static void validate(char grade) throws InvalidGradeException{
        if(grade<'A' || grade>'F'){
            throw new InvalidGradeException("Grade must be between A and F");
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Grade: ");
        char grade = sc.nextLine().charAt(0);
        try{
            validate(Character.toUpperCase(grade));
            System.out.println("Grade is valid");
        }catch(InvalidGradeException e){
            System.err.println("Invalid: "+e.getMessage());
        }
        
        sc.close();
    }
}
