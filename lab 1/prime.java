public class prime 
{
  public static void main(String[] args) {
    int num = 5;
    boolean flag = false;
    for (int i = 2; i <= num/2; i++) {
        // num/2 as a num is not divisible by more than its half
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
