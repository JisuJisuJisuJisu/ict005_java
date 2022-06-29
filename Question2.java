package Assignment2;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		x= input.nextInt();
		y= input.nextInt();
		z= input.nextInt();
		
		System.out.println(x > y && x > z);
		System.out.println(x=y=z);
		
	}

}
