import java.util.*;
public class countOccurrence
{
    public static void main(String[] args) 
    {
        int n, target, count = 0, i = 0;
        //Creating Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array:");
        n = scanner.nextInt();

        //Declaring array of size n
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
    
        System.out.println("Enter the element to count it's number of occurrences:");
        target = scanner.nextInt();
            
        for(i = 0; i < n; i++)
        {
            if(a[i] == target)
            {
                count++;
            }
        }
        //Closing scanner object in VS Code 
        scanner.close();
        System.out.println("Number of Occurrence of the Element:"+count);
    }
}