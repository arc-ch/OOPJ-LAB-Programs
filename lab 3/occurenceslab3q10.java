import java.util.*;
public class occurenceslab3q10
{
    public static void main(String[] args) 
    {
        int n, x, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
            for(i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            for(i=0 ; i<n ;i++)
            {
                x = a[i];
                int count =0;
                for(int j=0; j < n; j++)
                {
                    if(a[j] == x)
                    {
                        count++;
                    }
                }
                System.out.println("Number of Occurrence of the Element " +a[i] + " is: " +count);
            }
        sc.close();
    }
}


