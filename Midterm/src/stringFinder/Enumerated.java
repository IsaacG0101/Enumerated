package stringFinder;

import java.util.Scanner;

enum Color {RED, GREEN, BLUE}

public class Enumerated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		int num;
		String userInput;
		System.out.println(Color.valueOf("RED").ordinal());
		System.out.println("The colors are");
		Color []  allColors = Color.values();
		for (Color col : allColors){
			System.out.print(col + ", ");
			//System.out.println(col.ordinal());
		}
		
		System.out.println("\nEnter a number and i will respond woth the repsctive color");
		num = keyboard.nextInt();
		System.out.println("The color you chose was " + allColors[num]);
		keyboard.nextLine();
		
		System.out.println("Enter a color and ill give you the Number of the color");
		userInput = keyboard.nextLine();
		System.out.println(Color.valueOf(userInput).ordinal());
	}

}
