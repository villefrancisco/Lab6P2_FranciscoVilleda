
package lab6p2_franciscovilleda_12111170;

import java.awt.Color;
import java.util.*;

public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private Date bday;
    private Color color;
    private boolean grupo = false;
    ArrayList<Pokedex> pok = new ArrayList();
    private String lider = "";
    

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String usuario, String password, Date bday, Color color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.bday = bday;
        this.color = color;
        pok.add(new Pokedex("1"));
        pok.add(new Pokedex("2"));
        pok.add(new Pokedex("3"));
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Pokedex> getPok() {
        return pok;
    }

    public void setPok(ArrayList<Pokedex> pok) {
        this.pok = pok;
    }

    public boolean isGrupo() {
        return grupo;
    }

    public void setGrupo(boolean grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return nombre + " " + lider;
    }
    
}
