import java.util.Scanner;
class weekdaylab3q3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the Weekday Number : ");
		int daynumber = sc.nextInt();
        sc.close();

		switch (daynumber)
		{
		case 1:
			System.out.printf("Monday");
			break;
		case 2:
			System.out.printf("Tuesday");
			break;
		case 3:
			System.out.printf("Wednesday");
			break;
		case 4:
			System.out.printf("Thursday");
			break;
		case 5:
			System.out.printf("Friday");
			break;
		case 6:
			System.out.printf("Saturday");
			break;
        case 7:
			System.out.printf("Sunday");
			break;
		default:
			System.out.printf("Invalid");
			break;
		}
	}
}

