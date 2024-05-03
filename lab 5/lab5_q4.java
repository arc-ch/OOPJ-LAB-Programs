public class lab5_q4 {
    lab5_q4(String name, int roll) {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
    lab5_q4(String acc_type,int accnum, float accbalance) {
        System.out.println("Account Type: " + acc_type);
        System.out.println("Acc No: " + accnum);
        System.out.println("Balance: " + accbalance);
    }
    public static void main(String args[]) {
        lab5_q4 perdetails = new lab5_q4("Archit Choudhury", 22053579);
        lab5_q4 bankdetails = new lab5_q4("Savings",123456,56789);
    }
}