package Assignment3;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Number? ");
		int animal = in.nextInt();
		String number;
		
		switch (animal) {
		case 1 :
			number= "dog";
			break;
		case 2 :
			number = "cat";
			break;
		case 3 :
			number = "chick";
			break;
		default:
			number = "I don't know.";
			break;
		}
		System.out.print(number);


	}

}
