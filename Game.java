/*CSCI 1101 - MAFIA Project
 * Kate, Elliot, Sasha, Allie, Rey */

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	Scanner kb = new Scanner(System.in);
public Game(ArrayList<Character> l) {
	l = new ArrayList<Character>();
}
public int vote() {
	System.out.print("Time to vote on who to lynch.");
	for(int i=0; i<l.size(); i++){
		System.out.println("Press " + i + " for " + l.get(i).getName());
	}
	int choice = kb.nextInt(); //choice
	return choice;
}
}
