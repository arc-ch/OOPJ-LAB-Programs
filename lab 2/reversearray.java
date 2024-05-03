import java.util.Scanner;
public class reversearray {
    public static void main(String[] args)
     {
        System.out.println("Enter Size Of Array: ");
        //Creating scanner object 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Array Declaration
        int[] arr = new int[n];
        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Elements of the array are:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" ");
        for(int i= 0;i<n/2;i++)     //or while(start<end) // temp=start start=end end=temp; start++ end --
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("The Reverse of the Array is: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(" " + arr[i]);
        }
        
        //Closing scanner object in VS Code
        scanner.close();
    }
}
