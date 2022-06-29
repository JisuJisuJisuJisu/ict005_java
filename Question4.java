package Assignment4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		
		x=input.nextInt();
		
		int i =1;
		int sum=0;
		
		for (i=1;i<=x;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
//Question1과 동일한 질문이라 for문으로 작성했습니다.
