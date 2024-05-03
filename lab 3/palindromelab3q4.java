import java.util.Scanner;
class palindromelab3q4 { 
        public static void main(String args[]){  
         int r,copy=0,temp;  
         //int n=5546455; 
         Scanner sc= new Scanner(System.in);  
         int n=sc.nextInt();
         temp=n;    
         while(n>0){    
          r=n%10;  //getting remainder
          copy=(copy*10)+r;    
          n=n/10;  //reducing value from right
         }    
         if(temp==copy)    
          System.out.println("palindrome number ");    
         else    
          System.out.println("not palindrome");    
       }  
       }  


       
    //    Initially: n = 123, copy = 0

    //    1. r=0 copy=0
    //      r = 123 % 10 = 3
    //      copy = (0 * 10) + 3 = 3
    //      n = 123 / 10 = 12
       
    //    2nd Iteration:
    //      r = 12 % 10 = 2
    //      copy = (3 * 10) + 2 = 32
    //      n = 12 / 10 = 1
       
    //    3rd Iteration:
    //      r = 1 % 10 = 1
    //      copy = (32 * 10) + 1 = 321
    //      n = 1 / 10 = 0
       
    //    End of loop: n is now 0, copy is 321
       
    //    Reversed Number: 321
       