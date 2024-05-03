public class lab8_6 extends Thread {
    static int c=0;
    public void run()
    {
        for(int i=1;i<=100;i++)
        c++;    
    }
    public static void main(String[] args) {
     lab8_6 t1=new lab8_6();
     lab8_6 t2=new lab8_6();
        t1.start();
        t2.start();
        try{t1.join();
        t2.join();}
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        System.out.println(c);
    }
}