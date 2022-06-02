package helloworld;

import java.util.Scanner;

public class monthtranslator2 {

	public static void main(String[] args) {
		String month;
		
    Scanner Scan = new Scanner(System.in);
		System.out.print("월의 이름을 입력하시오: ");
	    month = Scan.next();
	
		int monthNumber = 0;
	    switch (month)
	    {
	    case"january":
	    	monthNumber = 1;
	    	break;
	    case"february":
	    	monthNumber = 2;
	    	break;
	    case"march":
	    	monthNumber = 3;
	    	break;
	    case"april":
	    	monthNumber = 4;
	    	break;
	    case"may":
	    	monthNumber = 5;
	    	break;
	    case"june":
	    	monthNumber = 6;
	    	break;
	    case"july":
	    	monthNumber = 7;
	    	break;
	    case"august":
	    	monthNumber = 8;
	    	break;
	    case"september":
	    	monthNumber = 9;
	    	break;
	    case"october":
	    	monthNumber = 10;
	    	break;
	    case"november":
	    	monthNumber = 11;
	    	break;
	    case"december":
	    	monthNumber = 12;
	    	break;
	    }
			System.out.println(monthNumber);
	}




	}


