
import java.util.Scanner;

class boxlab4q3 {
    int length;
    int width;
    int height;
    int volume() {
        return length * width * height;
    }
}

public class Demo { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boxlab4q3 box1 = new boxlab4q3();
        System.out.print("Enter the length of the box: ");
        box1.length = sc.nextInt();
        System.out.print("Enter the width of the box: ");
        box1.width = sc.nextInt();
        System.out.print("Enter the height of the box: ");
        box1.height = sc.nextInt();
        sc.close();
        System.out.println("Volume of the box: " +  box1.volume());
    }
}







