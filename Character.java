/*CSCI 1101 - MAFIA MULTIPLAYER GAME - PROJECT
 * CHARACTER CLASS
 * Elliot, Renayre, Sasha, Allie and Kate */
public class Character {
	private String name;
	private boolean alive;
	private Role role;
	private int votesAgainst;
	private boolean safe;
	private boolean isMafia; 
	
	//DEFAULT CONSTRUCTOR THAT CREATES EVERY CHARACTER AS ALIVE
	public Character () {}
	//COMPLETE CONSTRUCTOR
	public Character (String n, Role r) {
		name = n;
		alive = true;
		role = r;
		votesAgainst = 0;
		safe = false;
		isMafia = false;
	}
	//GET METHODS
	public String getName() {return name;}
	public boolean getAlive() {return alive;}
	public Role getRole() {return role;}
	public int getVotesAgainst() {return votesAgainst;}
	public boolean getSafe() {return safe;}
	public boolean getIsMafia() {return isMafia;}
	//SET METHODS
	public void setName(String n) {name = n;}
	public void setAlive(boolean a) {alive = a;}
	public void setRole(Role r) {role = r;}
	public void setVotesAgainst(int v) {votesAgainst = v;}
	public void setSafe(boolean s) {safe = s;}
	public void setIsMafia(boolean m) {isMafia = m;}
	
	public String toString() {
		return "Name: " + name + "\nAlive: " + alive + "\nRole: " + role;
	}
}
