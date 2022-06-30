package Midtest;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int n;
		
		x= in.nextInt();
		y= in.nextInt();
		z= x/y;
		n= x%y;
		
		System.out.print(x+" / "+y+" = "+z+"..."+n);
		
		
		
	}

}
