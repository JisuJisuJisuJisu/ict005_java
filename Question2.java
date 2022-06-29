package Assignment3;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet;
		
		Scanner input = new Scanner(System.in);
		alphabet = input.next();
		
		String grade;

		switch (alphabet) {
		case "A" :
			grade= "excellent";
			break;
		case "B" :
			grade = "Good";
			break;
		case "C" :
			grade = "Usually";
			break;
		case "D" :
			grade = "Effort";
			break;
		case "F" :
			grade = "Failure";
			break;
		default:
			grade = "error";
			break;
		}
		System.out.print(grade);

	}

}
