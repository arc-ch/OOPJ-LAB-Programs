import java.util.*;
class ThreeDObject {
    double wholeSurfaceArea() {
        return 0;
    }
    
    double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    double length;
    double width;
    double height;
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double wholeSurfaceArea() {
        return 2 * ( (length * width) + (length * height) + (width * height) );
    }
    double volume() {
        return length * width * height;
    }
}
class Cube extends ThreeDObject {
    double side;
    Cube(double side) {
        this.side = side;
    }
    double wholeSurfaceArea() {
        return 6 * (side * side);
    }
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double r;
    double h;
    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
    double wholeSurfaceArea() {
        return 2*3.14*r*(r + h);
    }
    double volume() {
        return 3.14*r*r*h;
    }
}

class Cone extends ThreeDObject {
    double radius;
    double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    double wholeSurfaceArea() {
        return ((3.14*radius*radius)+ (3.14*radius*Math.sqrt(radius*radius+height*height)));
    }
    double volume() {
        return (3.14*radius*radius*height)/3;
    }
}
public class lab5_q6_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions for Box:");
        System.out.print("Length: ");
        double boxLength = scanner.nextDouble();
        System.out.print("Width: ");
        double boxWidth = scanner.nextDouble();
        System.out.print("Height: ");
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box Whole Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());
        System.out.println();
        System.out.println("Enter dimensions for Cube:");
        System.out.print("Side: ");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Cube Whole Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println();
        System.out.println("Enter dimensions for Cylinder:");
        System.out.print("Radius: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Whole Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println();
        System.out.println("Enter dimensions for Cone:");
        System.out.print("Radius: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Whole Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
        scanner.close();
    }
}