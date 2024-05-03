import java.util.Scanner;
public class evenoddlab3q7 {

    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        sc.close();

        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}


