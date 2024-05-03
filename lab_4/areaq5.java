package lab_4;
import java.util.*;
public class areaq5 {
     static void area(double r){
        double ar = 3.14*r*r;
        System.out.println("Area of circle: "+ar);
    }
     static void area(int b, int h){
        double ar = 0.5*b*h;
        System.out.println("Area of triangle: "+ar);
    }
     static void area(int s) {
        int ar = s*s;
        System.out.println("Area of square: "+ar);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double r = sc.nextDouble();
                area(r);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                int b = sc.nextInt();
                System.out.print("Enter the height of the triangle: ");
                int h = sc.nextInt();
                area(b,h);
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                int s = sc.nextInt();
                area(s);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

    }
}