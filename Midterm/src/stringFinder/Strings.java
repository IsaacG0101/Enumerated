package stringFinder;

import java.util.Scanner;
public class Strings {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String Title = null, First = null,Middle, Last = null, Name;
		int space1=0, space2 = 0, space3 = 0, space4;
		
		System.out.println("Enter your full name preceded by title");
		Name = keyboard.nextLine();
		

		for (int i = 0; i < Name.length(); i++) {
			if (Name.charAt(i) == ' ') {
				space1 = i;
				break;
			}
		}
		
		//System.out.println(Name.substring(0, space1));
		Title = (Name.substring(0, space1));
		System.out.println("Title: " + Title.toUpperCase());
		
		for (int x = space1 +1; x < Name.length(); x++) {
			if (Name.charAt(x) == ' ') {
				space2 = x;
				break;
			}
				
		}
		First = (Name.substring(space1+1, space2));
		System.out.println("First: " + First);
	
		
		for (int y = space2+1; y < Name.length(); y++) {
			if (Name.charAt(y) == ' ') {
				space3 = y;
				break;
			}
		}
		
			if (space3 == 0) {
				Last = Name.substring(space2+1, Name.length());
			}else {
				Middle = (Name.substring(space2+1, space3));
				System.out.println("Middle: " + Middle);
				Last = Name.substring(space3+1);
			}
			
			System.out.println("Last: " + Last);
		// if space3 is 0, meaning there is not any space3, then space2 until the end is the last name
		// otherwise, if space3 is non-zero then space2 to space 3 is the middle name and then space 3->end is last
		
		
	}
}
		


