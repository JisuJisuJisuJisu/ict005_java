package Midtest;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int numbers;
		numbers=in.nextInt();
		
		int[]s=new int[10];
		
		int sum= 0;
		int sum2=0;
		
		for(int i=0; i%2>0; i++) {
			sum=s[i]+s[i++];
			System.out.println("odd: "+sum);
			if(i%2==0)
				sum+=s[i];
			
		}
		System.out.println("odd: "+sum);
		System.out.println("even: ");
		
	}

}
