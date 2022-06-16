package week5;

public class Hwtwototen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number="10101111";
		int sum = 0;
		int lengthOfString = number.length();
		
		int i = 0;
		while(i<lengthOfString){
			int digit = Integer.parseInt(number.charAt(i)+"");
			sum += digit*(int)Math.pow(2, lengthOfString-1-i);
			i++;
		}
		System.out.println("Convert: "+number+"(2) => "+sum);
	}

	}

