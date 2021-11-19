
package lab6p2_franciscovilleda_12111170;

import java.util.*;

public class Pokedex {
    
    ArrayList<Pokemon> pokemones = new ArrayList();
    private double damage;

    public Pokedex() {
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public double getDamage() {
        int acum = 0 , cont = 0;
        for (Pokemon temp : pokemones) {
            acum += temp.getDamage();
            cont += 1;
        }
        if(cont == 0){
            return 0;
        }
        else{
            damage = acum/cont;
        }
        return damage;
    }
    
    

    @Override
    public String toString() {
        return "Pokedex";
    }
    
}
