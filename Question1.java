package Assignment3;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		x= input.nextInt();

		if (x == 0) {
			System.out.println("zero");
		} else if (x<0) {
			System.out.println("minus");
		} else {
			System.out.println("plus");
		}
	}

}
