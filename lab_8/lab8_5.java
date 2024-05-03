public class lab8_5 extends Thread  
{    
    public void run()  
    {    
        System.out.println(Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        lab8_5 t1=new lab8_5();    
        lab8_5 t2=new lab8_5();    
        lab8_5 t3=new lab8_5();    

        t1.start();    
        t2.start();  
        t3.start();  
    }    
}  