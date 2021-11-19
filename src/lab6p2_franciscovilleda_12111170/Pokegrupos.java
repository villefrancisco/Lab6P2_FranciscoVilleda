
package lab6p2_franciscovilleda_12111170;

import java.util.*;

public class Pokegrupos {
    
    private String nombre;
    private ArrayList<Usuario> miembros = new ArrayList();
    private Usuario lider;
    private String tipo;

    public Pokegrupos(String nombre, Usuario lider, String tipo) {
        this.nombre = nombre;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
