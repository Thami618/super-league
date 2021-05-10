
package soccer;
//We will use this class to run a set of games
public class League {
    public static void main(String[] args) {
        Player player1 = new Player();
        //setting the name for Player1,Player2,Player3,for the Player instance
        player1.playerName = "Bukayo Saka";
        Player player2 = new Player();
        player2.playerName = "Bernd Leno";
        Player player3 = new Player();
        player3.playerName = "Alex Lacazette";
        Player player4 = new Player();
        player4.playerName = "Nico Pepe";
        Player player5 = new Player();
        player5.playerName = "Piere Auba";
        
        //Player Array that will have all the 5 players
        //A local Array
        Player[] thePlayers = {player1, player2, player3, player4, player5}; 
        //Declaring and instantiating a team object
        Team team1 = new Team();
        team1.teamName = "Arsenal";
        //playerArray from the TEAM class
        //playerArray and thePlayers are one/the same
        team1.playerArray = thePlayers;
        for (Player thePlayer : team1.playerArray){
            System.out.println(thePlayer.playerName);
        }


    }
    
}
