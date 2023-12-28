import javax.swing.ImageIcon;

public class Planta extends Pokemon {

    public Planta(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Planta", ataque,vida,defensa,0);
    }
}

class Bulbasaur extends Planta {
    public Bulbasaur(int ataque, int vida, int defensa) {
        super("Bulbasaur", "Planta", ataque, vida, defensa, 0);
        ImageIcon icon = new ImageIcon("image/B.png");
        this.setImagen(icon);
    }
    
}
class Snivy extends Planta{
    public Snivy(int ataque, int vida, int defensa) {
        super("Snivy", "Planta", ataque, vida, defensa, 0);
        ImageIcon icon = new ImageIcon("image/snivy.png");
        this.setImagen(icon);

    }
}
