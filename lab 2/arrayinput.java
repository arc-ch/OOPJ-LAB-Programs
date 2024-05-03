import java.util.Scanner;
// can write util.* to get all
public class arrayinput {
    public static void main(String[] args) {
        // Declaring array of size 5
        int[] arr = new int[5];

        // Creating Scanner object to take input 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

         // Close the scanner object in VS CODE
             scanner.close();

        System.out.println("Elements of the array are:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}


