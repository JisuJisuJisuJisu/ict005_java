package Assignment5;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x=in.nextInt();
		
		for(int row=0;row<x;row++) {
			int y=1;
			for (int col=0;col<x-1-row;col++) {
				System.out.print(" ");
			}
			for (int col=0;col<row+1;col++) {
				System.out.print(y++ +"");
			}
			System.out.println();
		}
	}

}
