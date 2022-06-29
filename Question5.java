package Assignment3;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String gender;
		int age;
	
		
		gender = input.next();
		age = input.nextInt();
		
		if (gender.equals("F") && age>=18) {
			System.out.println("WOMAN");
		} else if(gender.equals("F") && age<18) {
			System.out.println("GIRL");
		} else if (gender.equals("M") && age>=18) {
			System.out.println("MAN");
		} else if (gender.equals("M") && age<18) {
			System.out.println("BOY");
		} 

	}
}
