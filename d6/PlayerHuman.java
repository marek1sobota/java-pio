package pio.d6;

import java.util.Scanner;

public class PlayerHuman extends Player {

    private final Scanner scanner = new Scanner(System.in);

    public PlayerHuman () {}
    public PlayerHuman (String name) {
         super(name); // zamiast setName(name)
    }
    
    @Override
    public int guess(){
        System.out.println("Podaj liczbe: ");
        return scanner.nextInt();
    }
    
}
