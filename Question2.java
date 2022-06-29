package Assignment4;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		
		x=input.nextInt();
		
		int i =x;
		int sum=0;
		while(i<=100) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
