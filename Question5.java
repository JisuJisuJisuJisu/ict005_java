package Assignment4;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int number=0;
		int result=0;
		
	
		
		while(true) {
			int i=in.nextInt();
			if(i==0)
				break;
			if(i%3!=0&&i%5!=0)
				number++;
		} 
		
		System.out.print(number);
		
	}

}
