import javax.swing.ImageIcon;

public class Tierra extends Pokemon {

    public Tierra(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Tierra", ataque,vida,defensa,0);
    }
}

class Geodude extends Tierra {
    private ImageIcon imagen = new ImageIcon(getClass().getResource("image/geodude.png"));
    public Geodude(int ataque, int vida, int defensa) {
        super("Geodude", "Tierra", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
class Rhyhorn extends Tierra{
    private ImageIcon imagen = new ImageIcon(getClass().getResource("image/rhyhorn.png"));
    public Rhyhorn(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Rhyhorn", "Tierra", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
