package cs2.util;
import java.util.Scanner;

public class NumberMeanApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble();
		double total = 0;
		int count = 0;
		//Using -999 to "mark" the end of user inputs
		while(number != -999) {
			total += number;
			count++;
			number = in.nextDouble();
		}
		System.out.println(total / count);
	}
}
