import java.util.Scanner;
public class Sheetq9 {
    void sheets(int n) {
        int rs = 40 * n;
        System.out.println("Amount for 2D sheet = " + rs);
    }

    void boxs(int n) {
        int rs = 60 * n;
        System.out.println("Amount for 3D box = " + rs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sheetq9 obj = new Sheetq9();

        System.out.println("Enter square feet for 2D sheet:");
        int n = sc.nextInt();
        obj.sheets(n);

        System.out.println("Enter cubic feet for 3D box:");
        int b = sc.nextInt();
        obj.boxs(b);

        sc.close();
    }
}
