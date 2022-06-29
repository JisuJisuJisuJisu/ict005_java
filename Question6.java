package Assignment6;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println(min);
	}

}
