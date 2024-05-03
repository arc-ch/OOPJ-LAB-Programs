import java.util.Scanner;
public class objectcounterlab3q9 {

        static int numberOfObjects = 0;
         objectcounterlab3q9() {
            numberOfObjects++;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of objects to create: ");
            int num = scanner.nextInt();

            for (int i = 0; i < num; i++)
                new objectcounterlab3q9();

            System.out.println("Number of objects created: " + numberOfObjects);
            scanner.close();
        }
    }




    