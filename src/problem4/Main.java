package problem4;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// Ask the user 10 multiplication questions. Check their answers and
		//give them their score
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);
		System.out.println("these are 10 multiplication questions: ");
		int Score=0;
		for (int i = 0; i < 10; i++) {
			int num1 = rnd.nextInt(10);
			int num2 = rnd.nextInt(10);
			System.out.println(num1 + " x " + num2 + " =?");
			int answer = in.nextInt();
			if (answer != num1 * num2) {
				System.out.println("wrong");

			} else {
				System.out.println("correct");
				Score++;
				System.out.println("Your score is now " + Score);
			} 
		}
		System.out.println("You got "+ Score + " /10");
	}

}
