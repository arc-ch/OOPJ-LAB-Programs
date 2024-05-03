import java.util.*;
class checkargument extends Exception
{
    checkargument(String s)
    {
        super(s);
    }
}
public class sumsq {
    public static void main(String args[])
     {
        System.out.println("checking ...");
        int a=Integer.valueOf(args[0]);
        int b=Integer.valueOf(args[1]);
        int c=Integer.valueOf(args[2]);
        int d=Integer.valueOf(args[3]);

        if(a<=4||b<=4||c<=4||d<=4)
        {
            try
            {
                if(a<=4||b<=4||c<=4||d<=4)
                throw new checkargument(" Exception occurred -");
            }
            catch(Exception e)
            {
                System.out.println("CheckArgument");
            }
        }
        else{
            int e=a*a+b*b+c*c+d*d;
            System.out.println("sum of sq of number ="+e);
        }
    }
}