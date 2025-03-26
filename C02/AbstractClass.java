package C02;
import java.util.Scanner;

//abstract class
abstract class Employee {
    String name;
    int id;

    //constructor
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    //abstract method
    abstract double calculateSalary();
}


class FullTimeEmployee extends Employee{
    double monthlySalary;
    
    //constructor
    FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary(){
        return monthlySalary;
    }
}


class PartTimeEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        String name;
        int id, workHours;
        double salary;
        Scanner sc = new Scanner(System.in);


        System.out.println("----Enter details of full time employee----");
        System.out.print("Id: ");
        id = sc.nextInt();
        sc.nextLine();//for consuming the leftover newline from nextInt
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Monthly Salary: ");
        salary = sc.nextDouble();

        FullTimeEmployee ft = new FullTimeEmployee(name, id, salary);

        System.out.println("\n----Enter details of part time employee----");
        System.out.print("Id: ");
        id = sc.nextInt();
        sc.nextLine();//for consuming the leftover newline from nextInt
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Hourly Salary: ");
        salary = sc.nextDouble();
        System.out.print("Hours Worked: ");
        workHours = sc.nextInt();

        PartTimeEmployee pt = new PartTimeEmployee(name, id, salary, workHours);

        System.out.println("\n--------Employee Details--------");
        System.out.println("Id: "+ft.id+"\tName:"+ft.name+"\tSalary:"+ft.calculateSalary());
        System.out.println("Id: "+pt.id+"\tName:"+pt.name+"\tSalary:"+pt.calculateSalary());

        sc.close();
    }
       
}