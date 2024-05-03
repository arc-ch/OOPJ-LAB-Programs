// 1
// 1 2
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

public class pattern1 {
    public static void main(String[] args) {
        for(int i = 0;i<=5;i++)
        {
            int x = 1;
            for(int j = 0;j<i;j++)
            {
                System.out.print(x);
                x++;
            }
            System.out.println( );
        }
    }
}