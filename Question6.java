package Midtest;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String line;
		
		System.out.print("Type the line: ");
		line= in.next();
		
		System.out.println("The number of alphabet: "+line.length());
		System.out.println("The number of alphabet: "+line.charAt(1));
	}

}
