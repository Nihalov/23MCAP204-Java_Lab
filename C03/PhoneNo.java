package C03;
import java.util.Scanner;

class PhoneException extends Exception{
    PhoneException(String message){
        super(message);
    }
}



public class PhoneNo {
    public static void validate(String phoneNo) throws PhoneException{
        if(phoneNo.length()!=10){
            throw new PhoneException("Phone number should contain exactly 10 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNo;
        System.out.print("Enter Phone number: ");
        phoneNo = sc.nextLine();
        try{
            validate(phoneNo);
            System.out.println("Phone number is valid");
        }catch(PhoneException e){
            System.err.println("Error: "+e.getMessage());
        }
        sc.close();
    }
}
