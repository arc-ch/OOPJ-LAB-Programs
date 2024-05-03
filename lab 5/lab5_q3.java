import java.util.*;
        //PARAMETRIZED CONSTRUCTOR
 class lab5_q3 {
    String name;
    int roll;

     lab5_q3(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll: ");
        int roll = sc.nextInt();
        lab5_q3 parametrized_constructor = new lab5_q3(name, roll);

        sc.close();
    }
}
