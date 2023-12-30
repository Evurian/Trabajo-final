import javax.swing.*;
public class Agua extends Pokemon {

    public Agua(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp){
        super(nombre,"Agua", ataque,vida,defensa,0,eqp);
    }
}

class Squirtle extends Agua {
    public Squirtle(int ataque, int vida, int defensa, boolean eqp) {
        super("Squirtle", "Agua", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/squirtle.png");
        this.setImagen(icon);
    }
}
class Froakie extends Agua{
    public Froakie(int ataque, int vida, int defensa, boolean eqp) {
        super("Froakie", "Agua", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/froakie.png");
        this.setImagen(icon);
    }
}
