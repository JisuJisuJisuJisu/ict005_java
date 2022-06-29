package Assignment5;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
			System.out.print(i*j+" ");
		}
			System.out.println();
	}

}
}