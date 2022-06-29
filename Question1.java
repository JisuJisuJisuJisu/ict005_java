package Assignment5;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int x;
	
		x=in.nextInt();
		int num=0;
		int sum=0;
		for(int i=1;sum<x;i++) {
			if(i%2==1) {
				sum+=i;
				num++;
			}
		}
		System.out.println(num+" "+sum);
}

}
