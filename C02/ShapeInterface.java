package C02;
import java.util.Scanner;

interface Shape{
    double calculateArea();
}

class Triangle implements Shape{
    int base, height;
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return 0.5*base*height;
    }
}

class Rectangle implements Shape{
    int length, width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length*width;
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length,width,height,base;
        System.out.print("Enter length of Rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter width of Rectangle: ");
        width = sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        height = sc.nextInt();
        System.out.print("Enter base of Triangle: ");
        base = sc.nextInt();

        Shape shape1 = new Rectangle(length, width);
        Shape shape2 = new Triangle(base, height);

        System.out.println("Area of Rectangle = "+shape1.calculateArea());
        System.out.println("Area of Triangle = "+shape2.calculateArea());
        sc.close();
    }
}
