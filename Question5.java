package Assignment6;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	

		int[] arr = new int[100];

		for(int i=0;i<arr.length;i++) {
			arr[i] = in.nextInt();
			if(arr[i] == 0)
				break;
		}

		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
			System.out.print(arr[i]+" ");
			}
		}
	}

}
