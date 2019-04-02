package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		System.out.println("Put your word: ");
		String x = in.nextLine();
		for (int y =0; y< x.length(); y++) {
			System.out.println(x.charAt(y));
		}
	}

}
