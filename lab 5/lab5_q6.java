import java.util.Scanner;
class Commission{
    double sales;
    Commission(double sales){
        this.sales=sales;
    }
    void commission(double sales)
    {
        double commission = (sales * 15)/100 ;
        System.out.println("The Commission is : " + commission);
    }
}
public class lab5_q6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of Sales: ");
        double sales = scanner.nextDouble();
        if(sales<0)
        System.out.println("Enter A Valid Amount !!");
        else{
        Commission C1 = new Commission(sales);
        C1.commission(sales);
        scanner.close();
        }
    }
}