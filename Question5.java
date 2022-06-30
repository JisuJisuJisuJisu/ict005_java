package Midtest;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int x=in.nextInt();
		String [] alphabet= {"A","B","C","D","E"};
		for(int row=0;row<alphabet.length;row++) {
			int y=0;
		
			for (int col=0;col<alphabet.length-1-row;col++) {
				System.out.print(" ");
			}
			for (int col=0;col<row+1;col++) {
				System.out.print(alphabet[y+row]+"");
			}
			System.out.println();
		}
	}

}
