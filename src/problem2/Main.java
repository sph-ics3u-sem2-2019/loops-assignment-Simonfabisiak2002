package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
System.out.println("input one: ");
int y =in.nextInt();
System.out.println("input two: ");
int x = in.nextInt();
int w = 0;

for (int c =y; c <= x; c++ ) {
w=w + c ;
}
System.out.println(w);
	


}

	}


