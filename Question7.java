package Midtest;
import java.util.Scanner;
public class Question7 {
//소수판별하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		int x;
		x=in.nextInt();
		int i;
		
	if(x>=2 && x/x<=1) {
		System.out.println("Not a prime number.");
	}else {
		System.out.println("Prime number.");
	}
	}

}
