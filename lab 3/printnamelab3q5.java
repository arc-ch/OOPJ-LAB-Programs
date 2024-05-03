import java.util.Scanner;
public class printnamelab3q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        sc.close();

        System.out.println("Full name: " + lastName + " " + firstName);
    }
}



