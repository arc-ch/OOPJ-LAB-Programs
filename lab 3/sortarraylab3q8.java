import java.util.Scanner;
public class sortarraylab3q8 {
	public static void main(String []args) {
		int n, i, j, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of integers to sort");
		n = sc.nextInt();
       
		int array[] = new int[n];
		System.out.println("Enter " + n + " integers");
		for (i = 0; i < n; i++) 
		      array[i] = sc.nextInt();
        sc.close();
    
		for (i = 0; i < ( n - 1 ); i++) {		//bubble sort
			for (j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j+1]) 
			 {      temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		System.out.println("Sorted list of numbers");
		for (i= 0; i < n; i++) 
		      System.out.println(array[i]);
	}
}





