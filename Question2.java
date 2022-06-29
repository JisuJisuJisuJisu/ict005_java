package Assignment6;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		System.out.print("Type weight of 6 people: ");
		double[] weights = new double[6];
		//사용자 입력을 처리하는 반복문
		for(int i = 0; i<weights.length;i++)
		{
			weights[i] = in.nextDouble();
		}
		
		//몸무게의 합을 계산하는 반복문
		double sum =0;
		for(int i=0; i<weights.length;i++)
		{
			sum+=weights[i];
		}
		double avg = sum/weights.length;
		//avg = Math.round(avg); 소숫점 밑 버리는 함수
		avg = Math.round(avg*10);
		//System.out.println("average: "+ (sum/weights.length) );
		System.out.println(avg/10);
	}

}
