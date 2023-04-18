package pio.d6;


public class PlayerBot extends Player {

    public PlayerBot() {
    }

    public PlayerBot(String name) {
        super(name);
    }

    @Override
    public int guess() {
        return brain.nextInt(6)+1 ;
    }
    
}
