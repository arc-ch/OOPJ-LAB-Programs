import java.util.Scanner;
public class cgpaq7 {

     int roll;
     String name;
     double totalMarks;
     double marksSecured;
     double cgpa;

        //cgpa constructor
     cgpaq7(int roll, String name, double totalMarks, double marksSecured) {
        this.roll = roll;
        this.name = name;
        this.totalMarks = totalMarks;
        this.marksSecured = marksSecured;
        cgpacalc();
    }

     void cgpacalc() {
        this.cgpa = (marksSecured / totalMarks) * 10.0; }

    public void display() {
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Full Marks: " + totalMarks);
        System.out.println("Secured Marks: " + marksSecured);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.println("Enter Name: ");
        sc.nextLine(); 
        String name = sc.nextLine();
        System.out.println("Enter Full Marks: ");
        double totalMarks = sc.nextDouble();
        System.out.println("Enter Secured Marks: ");
        double marksSecured = sc.nextDouble();

        cgpaq7 student = new cgpaq7(roll, name, totalMarks, marksSecured);
        student.display();
        sc.close();
    }
}
