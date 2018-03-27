

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
		
		System.out.print("Please enter your name: ");
		String name = kb.next();
		
		int r = rn.nextInt(8);
		Role role = assignRole(r);
		
		players.add(name,role);
		
		for(int i=0; i<players.size(); i++) {
			if(players.get(i).getIsMafia()==true) {
				mafia.add(players.get(i));
			}
		}
	}

//mafiaNight
public Character mafiaNight(){
	
}
}
