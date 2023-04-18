package pio.d6;
// wzorzec strategia

public class PioD6 {

    public static void main(String[] args) {
     
           
    Game game = new Game(null);
    game.addPlayer(new PlayerBot("Janek"));
    game.addPlayer (new PlayerBot("Marek"));
    game.addPlayer (new PlayerBot("Stefan"));    
    game.printPlayers();
    
//    game.play(); 
//    game.removePlayer("Stefan");

    for (int i=0; i<10; i++)
        game.play();
    
    game.printStats();
    game.clearStats();
    
    }

}
