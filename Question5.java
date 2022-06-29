package Assignment1;
import java.util.Scanner;
public class Question5 {
//소수 둘째자리 반올림하여 첫째자리까지 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double yard;
		
		
		System.out.print("yard? ");
		yard = input.nextDouble();
		
		double cm = yard *91.44;
		
		//System.out.println(Math.round(cm*10)/10.0);
		System.out.println(yard+"yard = "+ Math.round(cm*10)/10.0);
		
		
	}

}
