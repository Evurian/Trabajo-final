import javax.swing.*;
public class Electrico extends Pokemon {

    public Electrico(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp){
        super(nombre,"Electrico", ataque,vida,defensa,0,eqp);
    }
}

class Pichu extends Electrico {
    public Pichu(int ataque, int vida, int defensa, boolean eqp) {
        super("Pichu", "Electrico", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/pichu.png");
        this.setImagen(icon);
    }
    
}
class Elekid extends Electrico{
    public Elekid(int ataque, int vida, int defensa, boolean eqp) {
        super("Elekid", "Electrico", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/elekid.png");
        this.setImagen(icon);
    }
    
}
