import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the s1 string:");
        String s1 = sc.nextLine();
        
        System.out.println("Enter the s2 string:");
        String s2 = sc.nextLine();
    
        if (s1.contains(s2)) {
            System.out.println(" First string contains the s2 string.");
        } else {
            System.out.println("First string does not contain the s2 string.");
        }
        
        sc.close();
    }
}
