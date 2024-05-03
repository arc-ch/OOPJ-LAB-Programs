// import java.util.Scanner;
// class MyVolume 
// {
//     int cubeside;
//     double cuboidlen;
//     double cuboidWidth;
//     double cuboidht;
//     double sphereRadius;

//     MyVolume(int side) {
//         this.cubeside = side;
//     }
//         MyVolume(double length, double width, double height) {
//         this.cuboidlen = length;
//         this.cuboidWidth = width;
//         this.cuboidht = height;
//     }
//     MyVolume(double radius) {
//         this.sphereRadius = radius;
//     }
//     public int CubeVolume() {
//         return (cubeside*cubeside*cubeside);
//     }
//     public double CuboidVolume() {
//         return (cuboidlen*cuboidWidth*cuboidht);
//     }
//     public double SphereVolume() {
//         return ((4/3)*3.14*sphereRadius*sphereRadius*sphereRadius);
//     }
// }
// public class lab4_q8 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter side length of the cube: ");
//         int cubeside = scanner.nextInt();
//         System.out.print("Enter length of the cuboid: ");
//         double cuboidlen = scanner.nextDouble();
//         System.out.print("Enter width of the cuboid: ");
//         double cuboidWidth = scanner.nextDouble();
//         System.out.print("Enter height of the cuboid: ");
//         double cuboidht = scanner.nextDouble();
//         System.out.print("Enter radius of the sphere: ");
//         double sphereRadius = scanner.nextDouble();
//         MyVolume volume1 = new MyVolume(cubeside);
//         MyVolume volume2 = new MyVolume(cuboidlen, cuboidWidth, cuboidht);
//         MyVolume volume3 = new MyVolume(sphereRadius);
//         System.out.println("Cube Volume: " + volume1.CubeVolume());
//         System.out.println("Cuboid Volume: " + volume2.CuboidVolume());
//         System.out.println("Sphere Volume: " + volume3.SphereVolume());
//         scanner.close();
//     }
// }

class MyVolume {
    int cubeside;
    double cuboidlen, cuboidwid, cuboidht;
    double sphereRadius;

    MyVolume(int side) {
        this.cubeside = side;
    }

    MyVolume(double length, double width, double height) {
        this.cuboidlen = length;
        this.cuboidwid = width;
        this.cuboidht = height;
    }

    MyVolume(double radius) {
        this.sphereRadius = radius;
    }

    public int CubeVolume() {
        return (cubeside * cubeside * cubeside);
    }

    public double CuboidVolume() {
        return (cuboidlen * cuboidwid * cuboidht);
    }

    public double SphereVolume() {
        return ((4.0 / 3.0) * Math.PI * sphereRadius * sphereRadius * sphereRadius);
    }
}

public class lab4_q8 {
    public static void main(String[] args) {
        int cubeside = 5;
        double cuboidlen = 3.0;
        double cuboidwid = 4.0;
        double cuboidht = 5.0;
        double sphereRadius = 2.5;
        MyVolume volume1 = new MyVolume(cubeside);
        MyVolume volume2 = new MyVolume(cuboidlen, cuboidwid, cuboidht);
        MyVolume volume3 = new MyVolume(sphereRadius);
        System.out.println("Cube Volume: " + volume1.CubeVolume());
        System.out.println("Cuboid Volume: " + volume2.CuboidVolume());
        System.out.println("Sphere Volume: " + volume3.SphereVolume());
    }
}
