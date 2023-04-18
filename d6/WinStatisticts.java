package pio.d6;

import java.util.HashMap;
import java.util.Map;

public class WinStatisticts implements Statisticts {
 
    private Map<String, Integer> stats = new HashMap<>();
   
    public void winner(Player player){
        String name = player.getName();
        stats.put(name, stats.getOrDefault(name, 0) + 1);
    }
   
    public void print (){     
    System.out.println("##### STATS #####");
   // System.out.println(stats);
     stats.forEach((name, score) -> {
            System.out.println(name + ": " + score);
        });
    }
    
    public void clear(){
     stats.clear();
    } 
}
