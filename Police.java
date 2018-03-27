/*CSCI 1101 - MAFIA GAME
 * Allie, Sasha, Elliot, Rey and Kate */
 
public class Police extends Role{
	//attributes
   private static String role = "Police";
   
	public Police() {}
   
	public boolean Investigate(Character c) { // police investigates who Mafia is
	   return c.getIsMafia();
	}
   public String getRoleDescription(){
      return "Your job is to investigate one person per night to" +
      "help the town find the mafia members. Work with the town to remove any mafia " +
      "members by voting for them to be lynched during the day phase.";
   }
   public String getRole(){
      return role;
   }
}
