import java.util.*;
public class max_min_array {
    public static void main(String[] args)
     {
        System.out.println("Enter Size Of Array: ");
        //Creating  scanner object
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" ");

        //max
        int max = arr[0];
        for (int i = 0; i < n; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        //min
        int min= arr[0];
        for (int i = 0; i < n; i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Maximum Element is " +max + " and minimum is " +min);
            //closing scanner obj in vs code
        scanner.close();
    }
} 