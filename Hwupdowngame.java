package week5;

import java.util.Random;
import java.util.Scanner;

public class Hwupdowngame {

	public static void main(String[] args) {
	
		Random rand = new Random();
		int iValue = rand.nextInt(100)+1;
		//1<=iValue<101
        Scanner in = new Scanner(System.in);
		
		System.out.println("I choose a number between 1~100. Can you guess?");
		System.out.print("input number: ");
		int guess = in.nextInt();
		System.out.println(guess);
		
		int i = 1;
		while(true) {
			
			if (guess<iValue)
		{ 
		System.out.println("Wrong. input bigger number. > ");
		i++;
		}
			else if (guess>iValue)
		{System.out.println("Wrong. input smaller number. > ");
		i++;}
			else if (guess==iValue)
		{System.out.println("Correct!");
		 System.out.println(i+"times try.");}
		break;
		}
		System.out.println("Input number : ");
        guess = in.nextInt();
    };
		
	
		}

	
		
		
	


