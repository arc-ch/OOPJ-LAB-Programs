import java.util.Scanner;
public class diagSumlab3q11 {
    public static void main(String[] args) {
    int[][] arr = new int[3][3];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the values of 3*3 Matrix : ");
    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<3;j++)
        {
            arr[i][j]= scanner.nextInt();
        }
    }
    
    int left=0,right=0;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(i==j)
            left = left + arr[i][j];
            if(i+j==2)
            right = right + arr[i][j];
        }
    }
    
    System.out.println("Left diagonal sum: "+left); 
    System.out.println("Right diagonal sum: "+right);     
}    
}



