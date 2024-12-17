package guessTheNumberGame;

import java.util.Scanner;
import java.util.Random;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner uInput = new Scanner(System.in);
		Random randNum = new Random();
		
		int aiNum;
		int inpNum = 0;
		
		System.out.println("Hello, fellow user! You shall guess the number that I thinked of "
				+ "with this terminal app");
		aiNum = randNum.nextInt(10);
		System.out.println("I already thinked of a number...");
		
		while (inpNum != aiNum) {
		
		System.out.println("Enter your guess:");
		inpNum = uInput.nextInt();
		
		if (inpNum == aiNum) {
			System.out.println("Congragulations, you have guessed the number!");
				
			uInput.close();
			System.exit(0);
			
		} else {
			System.out.println("Wrong answer :(");
			}
		}
		
	}

}
