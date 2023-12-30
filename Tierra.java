
import javax.swing.ImageIcon;

public class Tierra extends Pokemon {

    public Tierra(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp){
        super(nombre,"Tierra", ataque,vida,defensa,0,eqp);
    }
}

class Geodude extends Tierra {
    public Geodude(int ataque, int vida, int defensa, boolean eqp) {
        super("Geodude", "Tierra", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/geodude.png");
        this.setImagen(icon);
    }
    
}
class Rhyhorn extends Tierra{
    public Rhyhorn(int ataque, int vida, int defensa, boolean eqp) {
        super("Rhyhorn", "Tierra", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/rhyhorn.png");
        this.setImagen(icon);
    }
    
}
