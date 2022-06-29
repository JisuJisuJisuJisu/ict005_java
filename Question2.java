package Assignment5;
import java.util.Scanner;
public class Question2 {
//미완성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		int x=in.nextInt();
		int y=in.nextInt();
		if(x>y) {
			for(int col=1;col<10;col++) {
				for(int row=x;row>=y;row--) {
					System.out.print(row+" * "+col+" = "+row*col+"   ");
				}
				System.out.println();
			}
		}
		else {
			for(int col=1;col<10;col++) {
				for(int row=x;row<=y;row++) {
					System.out.print(row+" * "+col+" = "+row*col+"   ");
				}
				System.out.println();
			}
		}
	}

}
