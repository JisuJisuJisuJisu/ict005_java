package Midtest;
import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		
		int x;
		int y;
	
		x=in.nextInt();
		y=in.nextInt();
		
		for(int row=0;row<x;row++) {
			int z=1;
			for (int col=0;col<y;col++) {
				System.out.print(z++ +" " );
			}
			System.out.println();
		}
//		for(col=1;col<y;col++) {
//			for(row=0;row<x;row++) {
//				System.out.print(y++);
//			}
//			System.out.println("*");
//		}
	}

}
