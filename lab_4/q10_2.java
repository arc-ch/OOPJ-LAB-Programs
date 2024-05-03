

import java.util.* ;
public class q10_2
{
    boolean is_prime(int n)
    {
        int c=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==1)
        {
            System.out.println("It is prime number");
            return true;
        }
        else
        {
            System.out.println("It is not prime number");
            return false;
        }
    }  
    boolean is_even(int n)
    {
        if(n%2==0)
        {
            System.out.println("It is even number");
            return true;
        }
        else
        {
            System.out.println("It is not even number");
            return false;
        }
    }
    boolean is_perfect(int n)
    {
        int c=n,s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        if(c==s)
        {
            System.out.println("It is perfect number");
            return true;
        }
        else
        {
            System.out.println("It is not perfect number");
            return false;
        }
        
    }
    int fin_factorial(int n)
    {
        if(n==0)
        return 1;
        else
        return n*fin_factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Prime, Perfect, Even, Factorial: ");
        int n=sc.nextInt();
        q10_2 obj=new q10_2();
        obj.is_even(n);
        obj.is_prime(n);
        obj.is_perfect(n);
        System.out.println("Factorial of number="+obj.fin_factorial(n));
        
    }
}