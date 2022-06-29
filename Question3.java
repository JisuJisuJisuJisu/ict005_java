package Assignment6;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		double[]arr= {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		int x =in.nextInt();
		int y =in.nextInt();
		
		double sum=arr[x-1]+arr[y-1];
		System.out.print(Math.round(sum*100)/100.0);
			
	}

}
