package Midtest;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);

		int[] number = new int[15];
		int row;
		int col;
		
		String input = in.nextLine();
		
		for(row=0;row<9;row++) {
			
			for(col=0;col<2;col++) {
				System.out.println("");
			}
			System.out.println(row+"~"+(row+10)+" : "+col);
		}
	}

}
