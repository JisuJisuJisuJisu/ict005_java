package Midtest;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		
		if (x<y&&x<z) {
			System.out.print(x);
		} else if (y<x&&y<z) {
			System.out.print(y);
		} else if (z<x&&z<y) {
			System.out.print(z);
		}
		
	}

}
