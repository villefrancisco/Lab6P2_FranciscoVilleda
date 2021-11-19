
package lab6p2_franciscovilleda_12111170;

public class Pokemon {
    private String nombre;
    private int damage;
    private int hp;
    private String velocidad;

    public Pokemon() {
    }

    public Pokemon(String nombre, int damage, int hp, String velocidad) {
        this.nombre = nombre;
        this.damage = damage;
        this.hp = hp;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
