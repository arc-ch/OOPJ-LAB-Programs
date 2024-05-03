public class lab8_4 extends Thread 
{
    public void run()
    {
        try{
        System.out.println("welcome ....");
        Thread.sleep(5000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
    public static void main(String[] args) {
        lab8_4 t1=new lab8_4();
        lab8_4 t2=new lab8_4();
        t1.start();
        try{
            System.out.println("welcome ....");
            System.out.println(t1.getState());
            }
        catch(Exception e)
            {
                System.out.println(e);
            }
        t2.start();
    }
}