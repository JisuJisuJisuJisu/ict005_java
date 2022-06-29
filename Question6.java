package Assignment3;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int year;
		year= in.nextInt();
		
		if (year%4==0 && year%100!=0||year%400==0) {
			System.out.println("leap year");
		} else {
			System.out.print("common year");
		}
	}

}
