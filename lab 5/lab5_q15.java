import java.util.Scanner;

class plas {
    double calculateCost2D(double area) {
        return area * 40;
    }
}

class Box extends plas {
    Box() {
        super(); }

    double calculateCost3D(double volume) {
        return volume * 60;
    }
}

public class lab5_q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the plastic:");
        System.out.println("For 2D sheet, enter length and width in feet:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("For 3D box, enter height in feet:");
        double height = sc.nextDouble();
        double volume = area * height;
        plas p = new plas();
        Box b = new Box();
        double cost2D = p.calculateCost2D(area);
        double cost3D = b.calculateCost3D(volume);
        System.out.println("Cost of 2D sheet: Rs " + cost2D);
        System.out.println("Cost of 3D box: Rs " + cost3D);
    }
}
