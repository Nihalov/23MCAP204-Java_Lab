import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Grade: ");
        int grade = sc.nextInt();

        switch (grade/10) {
            case 10:
            case 9:
                System.out.println("Excellent work!");
                break;
            case 8:
                System.out.println("Good Job!");
                break;
            case 7:
                System.out.println("You can do better");
                break;
            case 6:
                System.out.println("Work harder");
                break;
            default:
                System.out.println("Failed. Try again");
        }

        sc.close();
    }
}
