package Assignment5;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		for (int row=0;row<=x;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=(x-row)*2-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
