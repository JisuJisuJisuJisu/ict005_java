package Assignment5;

import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//출력형태를 만든다 쪼개서 생각하는게 좋음
		//사옹자로부터 n을 입력받아 nxn의 출력형태를 만든다
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("n=");
		int n = in.nextInt();
		int number = 1;
	
		for(int row=1; row<=n; row++)//행과 열
		{
			for(int col=1; col<=n; col++ )
			{
				System.out.print(number%10+" ");
				number+=2;
				
				//두자릿수 이상의 숫자에서 1의 자리 수를 구할 땐 나머지 구하는 연산자를 쓸것 
			}
			System.out.println("");
			
			
		
		}
	}

}
