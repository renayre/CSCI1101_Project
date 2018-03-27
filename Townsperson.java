/*CSCI 1101 - MAFIA GAME
 * Allie, Sasha, Elliot, Rey and Kate */
 
public class TownsPerson{
   //attributes
   private static String role = "TownsPerson";
   
   public TownsPerson(){}
   
   public String getDescription(){
      return "Your job is to work with the rest of the town to "
      + "remove all mafia members from the town. You do this by voting " 
      + "for the suspected mafia members during the day phase to be lynched";
   }
   public String getRole(){
      return role;
   }
}
