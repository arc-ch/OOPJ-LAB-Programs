public class arithmetic{
    public static void main(String args[]){
    try{
    int data=100/0;
    }
    catch(ArithmeticException e)
    {System.out.println(e);}
    System.out.println("rest of the code...");
    }
    }
    
    
    // java.lang.ArithmeticException: / by zero
    // rest of the code...