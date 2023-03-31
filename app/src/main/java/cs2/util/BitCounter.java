package cs2.util;
import java.util.Scanner;

class BitCounterApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/* Solution using a while loop
		int x = in.nextInt();
		int counter = 0;
		while(x > 0) {
			if(x % 2 == 1) {
				counter = counter + 1; //counter += 1; counter++;
			}
			x = x / 2; // x /= 2;
		}*/

		//* Solution using a for loop
		int counter = 0;
		for(int x = in.nextInt(); x > 0; x /= 2) {
			if(x % 2 == 1) {
				counter++;
			}
		}
		//*/
		
		System.out.println(counter);
	}
}
