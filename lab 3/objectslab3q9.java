import java.util.Scanner;
public class objectslab3q9 {
         static int counter = 0;
        public objectslab3q9() {
            counter++;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of objects to create: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++)
                new objectslab3q9();
            System.out.println("Number of objects created: " + counter);
            sc.close();
        }
    }