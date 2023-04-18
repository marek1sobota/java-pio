package pio.d6;

import java.util.Random;

abstract public class Player {
    
    protected final Random brain = new Random();
    private String name = "Domyslne imie";
    
    public Player() {}
    public Player(String name){
        setName(name);   
    }
    
       public final void setName(String name){
       // if (name != null && !name.isEmpty()) {
          if (name != null && name.matches("^[A-Za-z\\d._-]{3,}$")) {
            this.name = name;
          }else 
              throw new IllegalArgumentException("Nieprawidlowe imie");      
     }
    
    public final String getName() {
        return name;
}
    abstract public int guess();
                                   
}
