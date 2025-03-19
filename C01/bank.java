package C01;
import java.util.Scanner;

class BankAcc {
    String accNo;
    String accHolder;
    double balance;
    
    BankAcc(String accNo, String accHolder, double balance){
        this.accNo=accNo;
        this.accHolder=accHolder;
        this.balance=balance;
    }

    void deposit(double amount){
        if(amount<0)
            System.out.println("Invalid amount. Deposit failed!");
        balance+=amount;
        System.out.println("Deposited "+amount);
    }

    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        System.out.println("Withdraw of "+amount+" succesfull");
        }else
            System.out.println("Sufficient amount is not available");
    }

    void accInfo(){
        System.out.println("\n---------------\nAccount No : "+accNo);
        System.out.println("Account Holder : "+accHolder);
        System.out.println("Balance : "+balance+"\n---------------\n");
    }
}


public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        BankAcc obj = new BankAcc(accNo, name, balance);
        System.out.println("----Account Created----");

        int ch;
        do{
            System.out.print("----MENU----\n1.Deposit\n2.Withdraw\n3.Account Info\n4.Exit\nEnter choice: ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double amD = sc.nextDouble();
                    obj.deposit(amD);
                    break;
                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double amW = sc.nextDouble();
                    obj.withdraw(amW);
                    break;
                case 3:
                    obj.accInfo();
                    break;
                case 4:
                    System.out.println("----Exiting----");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }while(ch!=4);

        sc.close();
    }
}
