package Assignment2;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int minx;
		int miny;
		int kix;
		int kiy;
		
		minx= input.nextInt();
		miny= input.nextInt();
		kix= input.nextInt();
		kiy= input.nextInt();
		
		System.out.println(minx > kix && miny > kiy);
		
	}
	
}
