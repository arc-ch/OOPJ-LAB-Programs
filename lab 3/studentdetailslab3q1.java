import java.util.*;
public class studentdetailslab3q1 {
    String name;
    int roll;
    int section;
    String branch;

    void read() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name:  ");
        name = in.nextLine();
        System.out.println("Enter Branch:  ");
        branch = in.nextLine();
        System.out.println("Enter Section:  ");
        section = in.nextInt();
        System.out.println("Enter Roll:  ");
        roll = in.nextInt();
        in.close();
    }

    void display() {
        System.out.println("Student's details are as follows: ");
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
        System.out.println("Roll: " + roll);
    }

    public static void main(String args[]) {
        studentdetailslab3q1 student1 = new studentdetailslab3q1();
        student1.read();
        student1.display();
    }
}