package Assignment4;
import java.util.Scanner;
public class Question6 {
//미완
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double x;
		double y;
		double z;
		
		
		while(true) {
			System.out.print("Base = ");
			x= in.nextInt();
			System.out.print("Height = ");
			y= in.nextInt();
			z= (x*y)/2;
			System.out.println("Triangle width = "+z);
			System.out.println("Continue? ");

			String an =in.next();
			if(!an.equals("Y")&&!an.equals("y")) {
				break;
			}
			
		}
		
//		System.out.print("Base = ");
//		x= in.nextInt();
//		System.out.print("Height = ");
//		y= in.nextInt();
//		z= (x*y)/2;
//		System.out.println("Triangle width = "+z);
//		System.out.println("Continue? ");
//		answer= in.next();
//		
//		do {
//			System.out.print("Base = ");
//			x= in.nextInt();
//			System.out.print("Height = ");
//			y= in.nextInt();
//			z= (x*y)/2;
//			System.out.println("Triangle width = "+z);
//			System.out.println("Continue? ");
//		} while (answer=="Y");
//		
	}

}
