package Assignment6;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[][] student=new int[4][3];
		for(int i=0;i<student.length;i++) {
			System.out.print((i+1)+"class? ");
			for(int j= 0; j<student[i].length;j++) {
				student[i][j]=in.nextInt();
			}
		}
		for (int i = 0; i < student.length; i++) {
			int sum = 0;
			System.out.print((i + 1) + "class : ");
			for (int j = 0; j < student[i].length; j++) {
				sum += student[i][j];
			}
			System.out.println(sum);
		}
	}

}
