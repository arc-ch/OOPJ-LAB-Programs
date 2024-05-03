import java.util.Scanner;
class Grader{
    int score;
    Grader(int score){
        this.score=score;
    }
    void letterGrade(int score){
        if(score >= 90 && score <= 100)
          System.out.println("O");
        else if(score >= 80 && score < 90)
          System.out.println("E");
        else if(score >= 70 && score < 80)
          System.out.println("A");
        else if(score >= 60 && score < 70)
          System.out.println("B");
        else if(score >= 50 && score < 60)
          System.out.println("C");    
        else
          System.out.println("F");      
    }
}
public class lab5_q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter The Marks Scored: ");
        int x = scanner.nextInt();
        if(x<0 || x>100)
            System.out.println("Invalid. Provide Valid Marks!");
        else{
            Grader S1 = new Grader(x);
            System.out.println("Your Grade is: ");
            S1.letterGrade(x);
        }
        scanner.close();    
    }
}