

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class GameDemo {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> vote = new ArrayList<Integer>();
		ArrayList<Character> players = new ArrayList<Character>(); 
		Random rn = new Random();
		
		System.out.print("Please enter your name: ");
		String name = kb.nextLine();
		
		int role = rn.nextInt(8);
		
		new Character(name,role);
		
		
		
		


		
	}
}
