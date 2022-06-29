package Assignment1;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int sum;
		int avg;
		
		x= input.nextInt();
		y= input.nextInt();
		z= input.nextInt();
		
		sum = x+y+z;
		avg = sum/3;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
		
	}

}
