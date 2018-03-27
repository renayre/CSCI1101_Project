/*CSCI 1101 - MAFIA GAME
 * Allie, Sasha, Elliot, Rey and Kate */
 
public class Doctor extends Role{
    //attributes
   private static String role = "Doctor";
   
   public Doctor(){}
   
   public void save(Character c){//when doctor picks what character to save
      c.setSafe(true);
   }
   
   public String getRoleDescription(){
      return "Your job is to heal (protect them if they are visited by the mafia) " 
      + "one person OR yourself at night and work with the town to remove any mafia "
      + "members by voting for them during the day phase to be lynched";
   }
}
