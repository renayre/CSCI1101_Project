

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class GameDemo {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> vote = new ArrayList<Integer>();
		ArrayList<Character> players = new ArrayList<Character>(); 
		ArrayList<Character> mafia = new ArrayList<Character>();
		Random rn = new Random();
		
		//intake
		System.out.print("Please enter your name: ");
		String name = kb.next();
		Character c = new Character(); //create empty
		c.setName(name);
		int r = rn.nextInt(8);
		c.setRole(r);
		
		players.add(c);
		
		for(int i=0; i<players.size(); i++) {
			if(players.get(i).getIsMafia()==true) {
				mafia.add(players.get(i));
			}
		}
		new Game(players);
	}
}

