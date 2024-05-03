public class factorial{
    public static void main(String[] args) {
        int num=5;
        int i;
        int factorial=1;
        for (i=num; i>0;i--)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of 5 is " + factorial);
    }
}