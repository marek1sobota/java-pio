package pio.d6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game  {

Random dice = new Random();
private Random rand = new Random();
private List<Player> players = new ArrayList();
private Statisticts statistics; 

public Game (){
    this(null);
}
public Game (Statisticts statistics){
    
if (statistics != null)     
    this.statistics=statistics;
else 
    this.statistics = new NullStatisticts();
}
    

public void addPlayer(Player player){
  if(!nameplayer(player.getName()))
    players.add(player); // rekurencja uwaażać
  else {
      player.setName(player.getName() + rand.nextInt(10));
      addPlayer(player);        
  }
}

public void printPlayers(){
    System.out.println("----------PLAYERS------------");
    for (Player player : players){
    System.out.println(player.getName());
    }
}

public void removePlayer(String name) {
    for (Iterator<Player> iterator = players.iterator(); iterator.hasNext();) {
        if (iterator.next().getName().equals(name)) {
            iterator.remove();
           
// for (int i =0; i<players.size(); i++){
// Player player = players.get(i);
// if(player.getName().equals(name)):
// players.remove(i);
// break;

 //players.removeIf( player -> player.getName().equals(name));
        }
    }    
}

private boolean nameplayer(String name){
    for (Player player : players){
       if(player.getName().equals(name)){
            return true;
       }
    }
    return false;
}
public void play(){
  
    int number;                    
    int guess;
    boolean repeat;
    
        do {
            System.out.println("---------------------");

            repeat = true;
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane: " + number);
             
            for (Player player : players) {
                guess = player.guess(); 
                System.out.println(player.getName() + ": " + guess);

            if (guess == number) {
                System.out.println("Brawo");
                repeat = false;
                statistics.winner(player);
            }
            else {
                System.out.println("Zle");
            }
            }
        } while (repeat);

    }

public void printStats(){
    statistics.print();
}

public void clearStats(){
    statistics .clear();   
}
}

   

