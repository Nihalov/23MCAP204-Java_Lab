package C01;
import java.util.Scanner;

class Rect{
    double length, width;

    //Default Constructor
    Rect(){
        length=width=1;
    }

    //Parameterised Constructor
    Rect(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        return length*width;
    }

    double peri(){
        return 2*(length+width);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rectangle length: ");
        double length = sc.nextDouble();
        System.out.print("Enter Rectangle width: ");
        double width = sc.nextDouble();

        Rect obj = new Rect(length,width);
        System.out.println("Area: "+obj.area());
        System.out.println("Perimeter: "+obj.peri());
        sc.close();
    }
}
