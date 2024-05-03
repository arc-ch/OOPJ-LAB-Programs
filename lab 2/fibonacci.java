import java.util.*;
    public class fibonacci {
    public static void main(String[] args) {

        // Creating a scanner object
        Scanner scanner= new Scanner(System.in);

        // Taking an input range for printing series
        System.out.print("Enter the range for Fibonacci series: ");
        //  length
        int n = scanner.nextInt();

        // Closing scanner object in VS CODE
        scanner.close();

        // Printing Fibonacci series within range
        System.out.println("Fibonacci series within the range:");

        int term1=0, term2=1;
        for(int i =1;term1<=n;i++)
        {
            System.out.println(term1 + " ");
            int resterm= term1+term2;
            term1=term2;
            term2=resterm;

        }
        
    }
}

    

