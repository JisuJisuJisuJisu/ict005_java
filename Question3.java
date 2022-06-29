package Assignment2;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		x= input.nextInt();
		y= input.nextInt();
		
		
		int nextx = ++x;
		int nexty = --y;
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x*y);
		
		//문제에는 두 수의 곱을 출력하라고 되어있는데 계산되는 값과 출력예의 값이 다르게 되어있습니다. 
	}

}
