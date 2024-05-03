import java.util.Scanner;
class Rectangle {
     int length;
     int breadth;

        Rectangle(int length, int breadth)
        { this.length = length;
        this.breadth = breadth;
    }
    
    int Area() {
        return length * breadth;
    }
    int Perimeter() {
        return (2 * (length + breadth));
    }

    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}
public class lab4_q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.displayDetails();
        scanner.close();
    }
}