import java.util.*;
public class q10_1 {
    float a, b, c;
    void set_dim() {
        System.out.println("Enter sides of triangle :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
    }

    boolean is_triangle() {
        if (a + b > c && b + c > a && c + a > b)
            return true;
        else
            return false;
    }

    float find_area() {
        float ar = 0, s;
        if (is_triangle()) {
            s = (a + b + c) / 2; 
            ar = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        } else {
            System.out.println("Given sides are not permissible to form a triangle");
        }
        return ar;
    }

    float find_perimeter() {
        float p = 0;
        if (is_triangle()) {
            p = a + b + c;
        } else {
            System.out.println("Given sides are not permissible to form a triangle");
        }
        return p;
    }

    void show() {
        System.out.println("Sides of triangle: " + a + " " + b + " " + c);
        System.out.println("Area of triangle: " + find_area());
        System.out.println("Perimeter of triangle: " + find_perimeter());
    }

    public static void main(String[] args) {
        q10_1 obj = new q10_1();
        obj.set_dim();
        obj.show();
    }
}
