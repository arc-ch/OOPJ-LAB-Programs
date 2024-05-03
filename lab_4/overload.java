public class overload {
    
     static int subtract(int a, int b) {
        return a - b;
    }

     static double subtract(double a, double b, double c) {
        return a - b - c;
    }

    public static void main(String[] args) {
        System.out.println(subtract(5, 3));            
        System.out.println(subtract(5.5, 4.4, 3.3));        
    }
}




