import java.util.Scanner;
class Account {
int acc_no;
double balance;
void input() {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter account number:");
acc_no = scanner.nextInt();
System.out.println("Enter balance:");
balance = scanner.nextDouble();
}
void disp() {
System.out.println("Account Number: " + acc_no);
System.out.println("Balance: " + balance);
}
}
class Person extends Account {
String name;
String aadhar_no;
@Override
void input() {
super.input();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter name:");
name = scanner.nextLine();
System.out.println("Enter Aadhar number:");
aadhar_no = scanner.nextLine();
}
@Override
void disp() {
super.disp();
System.out.println("Name: " + name);
System.out.println("Aadhar Number: " + aadhar_no);
}
}
public class lab5_q18 {
public static void main(String[] args) {
Person person1 = new Person();
Person person2 = new Person();
Person person3 = new Person();
System.out.println("Enter details for person 1:");
person1.input();
System.out.println("Enter details for person 2:");
person2.input();
System.out.println("Enter details for person 3:");
person3.input();
System.out.println("\nDetails of person 1:");
person1.disp();
System.out.println("\nDetails of person 2:");
person2.disp();
System.out.println("\nDetails of person 3:");
person3.disp();
}
}