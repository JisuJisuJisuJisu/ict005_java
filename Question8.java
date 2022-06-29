package Assignment5;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
 
		int x=in.nextInt();
		int y =1;
		
		for(int row=0;row<x;row++) {
			for (int col=0; col<row; col++) {
				System.out.print(" ");
			}
			for (int col=0;col<=x-row-1;col++) {
				System.out.print(y++ +"");
			}
			System.out.println();

	 
	}
	}
}
