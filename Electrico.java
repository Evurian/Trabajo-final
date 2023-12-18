import javax.swing.*;
public class Electrico extends Pokemon {

    public Electrico(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Electrico", ataque,vida,defensa,0);
    }
}

class Pichu extends Electrico {
    public Pichu(int ataque, int vida, int defensa) {
        super("Pichu", "Electrico", ataque, vida, defensa, 0);
        ImageIcon icon = new ImageIcon("image/pichu.png");
        this.setImagen(icon);
    }
    
}
class Elekid extends Electrico{
    public Elekid(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Elekid", "Electrico", ataque, vida, defensa, 0);
        ImageIcon icon = new ImageIcon("image/elekid.png");
        this.setImagen(icon);
    }
    
}
