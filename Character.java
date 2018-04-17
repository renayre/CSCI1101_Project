/*CSCI 1101 - MAFIA MULTIPLAYER GAME - PROJECT
 * CHARACTER CLASS
 * Eliot, Renayre, Sasha, Allie and Kate */
public class Character {
	private String name;
	private boolean alive;
	private String role;
	private int votesAgainst;
	private boolean safe;
	private boolean isMafia;
	private String password;
	
	//DEFAULT CONSTRUCTOR THAT CREATES EVERY CHARACTER AS ALIVE
	public Character () {}
	//COMPLETE CONSTRUCTOR
	public Character (String n, String r, String p) {
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
	public String getPassword() {return password;}
	//SET METHODS
	public void setName(String n) {name = n;}
	public void setAlive(boolean a) {alive = a;}
	public void setRole(Integer r) {//int to be found by random number generator in demo class
			if(r==1||r==2||r==3) 
				role = "Mafia";
			else if(r==4)
				role = "Doctor";
			else if(r==5)
				role = "Police";
			else
				role = "Civilian";
		}
	public void setVotesAgainst(int v) {votesAgainst = v;}
	public void setSafe(boolean s) {safe = s;}
	public void setIsMafia(boolean m) {isMafia = m;}
	public void setPassword(String s) {password = s;}
	
	public String toString() {
		return "Name: " + name + "\nAlive: " + alive + "\nRole: " + role;
	}
}
