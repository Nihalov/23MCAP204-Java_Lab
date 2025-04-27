package C02;
import java.util.Scanner;

class Person{
    String name, gender, address;
    int age;
    Person(String name, String gender, String address, int age){
        this.name = name; 
        this.gender = gender;
        this. address = address;
        this.age = age;
    }
}

class Employee extends Person{
    int empid;
    String company_name, qualification;
    int salary;
    Employee(String name, String gender, String address, int age, int empid, String company_name,String qualification, int salary){
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee{
    String subject, dept;
    int Tid;
    Teacher(String name, String gender, String address, int age, int empid, String company_name,String qualification, int salary,
        String subject, String dept, int Tid)
        {    
            super(name, gender, address, age, empid, company_name, qualification, salary);
            this.subject = subject;
            this.dept = dept;
            this.Tid = Tid;
        }

        void dis(){
            try{
                System.out.println("Employee Id: "+empid);
                Thread.sleep(500);
                System.out.println("Teacher ID: "+Tid);
                Thread.sleep(500);
                System.out.println("Name: "+name);
                Thread.sleep(500);
                System.out.println("Gender: "+gender);
                Thread.sleep(500);
                System.out.println("Address: "+address);
                Thread.sleep(500);
                System.out.println("Age: "+age);
                Thread.sleep(500);
                System.out.println("Company Name: "+company_name);
                Thread.sleep(500);
                System.out.println("Qualification: "+qualification);
                Thread.sleep(500);
                System.out.println("Salary: "+salary);
                Thread.sleep(500);
                System.out.println("Subject: "+subject);
                Thread.sleep(500);
                System.out.println("Department: "+dept);
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
}

public class PersonInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Techers: ");
        int n = sc.nextInt();
        sc.nextLine();// Consume leftover newline

        Teacher[] teachers = new Teacher[n];

        for(int i=0;i<n;i++){
            System.out.println("----Enter details for Teacher " + (i + 1) + ":");
            System.out.print("Emp ID: ");
            int empId = sc.nextInt();
            sc.nextLine();// Consume leftover newline
            System.out.print("Teacher ID: ");
            int teacherId = sc.nextInt();
            sc.nextLine();// Consume leftover newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Address: "); 
            String address = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();// Consume leftover newline
            System.out.print("Company Name: ");
            String companyName = sc.nextLine();
            System.out.print("Qualification: ");
            String qualification = sc.nextLine();
            System.out.print("Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();// Consume leftover newline
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();

            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
        }
        
        System.out.println("\n\n---------Teacher Details---------");
        for(int i=0;i<n;i++){
            System.out.println("\n----Details of teacher "+(i+1)+"----\n");
            teachers[i].dis();
        }

        sc.close();
    }
}