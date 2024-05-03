import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        try 
        {
            System.out.print("Enter values: ");
            for (int i = 0; i < size; i++) 
            {
                array[i] = sc.nextInt();
            }

            System.out.print("Enter the index which you want to access: ");
            int index = sc.nextInt();

            System.out.println("Value: " + array[index]);
        } 
        
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Exception caught: ");
            System.out.println("ARRAY OUT OF BOUNDS EXCEPTION- UNAVAIALBLE INDEX");
        }
    }
}