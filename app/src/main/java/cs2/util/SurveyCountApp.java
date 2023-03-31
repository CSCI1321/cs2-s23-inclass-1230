package cs2.util;

import java.io.File;
import java.util.Scanner;

public class SurveyCountApp {
	public static void main(String[] args) {
		//For reading from STDIN
		//Scanner input = new Scanner(System.in);
		
		//For reading from a file
		try {
			File suveryFile = new File("surveyData.txt");
			Scanner input = new Scanner(suveryFile);
		
			int len = input.nextInt();
			input.nextLine();
			String[] answers = new String [len];
			System.err.println(answers.length);
			for(int i=0; i<len; i++) {
				answers[i] = input.nextLine();
			}

			int countSome = 0;
			for(int i=0; i<len; i++) {
				if(answers[i].equals("Some Impact")) {
					countSome++;
				}
			}
			System.out.println("Some Impact = " + countSome);
		} catch(Exception exName) {
			System.err.println("Something went wrong");
			System.err.println(exName.getMessage());
		}
	}
}




