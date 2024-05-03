public class reverse   
{  
public static void main(String[] args)   
{  
int number = 12345, reverse = 0; 
//rev=0-> 12345%10=5 
//rev= 0*10+5=5
//num=12345/10=1234
//rem=1234%10=4
//rev=5*10+4=54........54321
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  