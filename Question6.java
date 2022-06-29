package Assignment5;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		for(int i =1;x*i<=100;i++) {
			System.out.print(x*i+" ");
			
			if((x*i)%10==0) {
				break;
			}
		}
	}

}
