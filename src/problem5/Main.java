package problem5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read the string and output in reverse case.
		Scanner in=new Scanner(System.in);
		String b =in.nextLine();
		for (int x=0;x<b.length();x++) {
		char letter=b.charAt(x);
		boolean upper= Character.isUpperCase(letter);
		boolean lower= Character.isLowerCase(letter);
if (upper==true) {
	letter=Character.toLowerCase(letter);
	System.out.print(letter); }
else if (lower==true) {
	letter=Character.toUpperCase(letter);
	System.out.print(letter);
}
else {System.out.print(letter);}
			}

		
			

		
	//System.out.print(b.substring(b));//
	}
}
