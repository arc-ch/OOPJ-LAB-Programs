public class overloadsublab4q4
{ public void disp(char c)
    {   
        System.out.println(c);}
        public void disp(int c)
    {   
        System.out.println(c );
    }
}
    class Sample2 {
         public static void main(String args[])
        {overloadsublab4q4 obj = new overloadsublab4q4(); 
        obj.disp('a');
        obj.disp(5);
    }
}