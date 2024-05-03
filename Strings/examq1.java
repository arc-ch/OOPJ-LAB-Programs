import java.util.*;
public class examq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings:  ");
        String s = sc.nextLine()+" ";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==32)
            count++;
        }
        System.out.println("Number of words ="+count);
    }
}