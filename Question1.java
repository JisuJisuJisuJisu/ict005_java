package Assignment2;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		x= input.nextInt();
		y= input.nextInt();
		
		System.out.println(x+" > "+y+" --- "+(x > y));
		System.out.println(x+" < "+y+" --- "+(x < y));
		System.out.println(x+" >= "+y+" --- "+(x >= y));
		System.out.println(x+" <= "+y+" --- "+(x <= y));
	}

}
