package Assignment4;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		
		x=input.nextInt();
		
		int i =1;
		int sum=0;
		while(i<=x) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
