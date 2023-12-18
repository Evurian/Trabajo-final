
import javax.swing.ImageIcon;

public class Tierra extends Pokemon {

    public Tierra(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Tierra", ataque,vida,defensa,0);
    }
}

class Geodude extends Tierra {
    public Geodude(int ataque, int vida, int defensa) {
        super("Geodude", "Tierra", ataque, vida, defensa, 0);
        ImageIcon icon = new ImageIcon("image/geodude.png");
        this.setImagen(icon);
    }
    
}
class Rhyhorn extends Tierra{
    public Rhyhorn(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Rhyhorn", "Tierra", ataque, vida, defensa, 0);
        ImageIcon icon = new ImageIcon("image/rhyhorn.png");
        this.setImagen(icon);
    }
    
}
