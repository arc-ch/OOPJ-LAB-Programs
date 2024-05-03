class nullptr
{
    public static void main(String... args)
    {
        try{
            String a=null;
            System.out.println(a.length());
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        System.out.println("Print outside catch");
    }
}




//java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
//Print outside catch