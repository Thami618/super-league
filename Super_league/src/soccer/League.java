
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
        
        //Creating a Second team using different approach
        Team team2 = new Team();
        team2.teamName = "Chelsea";
        //5 element PLAYER Array and i will assign it to playerArray 
        team2.playerArray = new Player[5];
        
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Ngolo Kante";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Mason Mount";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Reece James";
        team2.playerArray[3] = new Player();
        team2.playerArray[3].playerName = "Hakim Ziyech";
        team2.playerArray[4] = new Player();
        team2.playerArray[4].playerName = "Mendy";
        
        //Creating players and assign them to the playerarray
        for (Player thePlayer : team1.playerArray){
            System.out.println(thePlayer.playerName);
        }
        for (Player thePlayer : team2.playerArray){
            System.out.println(thePlayer.playerName);
        }
        


    }
    
}
