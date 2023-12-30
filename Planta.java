import javax.swing.ImageIcon;

public class Planta extends Pokemon {

    public Planta(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp){
        super(nombre,"Planta", ataque,vida,defensa,0,eqp);
    }
}

class Bulbasaur extends Planta {
    public Bulbasaur(int ataque, int vida, int defensa, boolean eqp) {
        super("Bulbasaur", "Planta", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/B.png");
        this.setImagen(icon);
    }
    
}
class Snivy extends Planta{
    public Snivy(int ataque, int vida, int defensa, boolean eqp) {
        super("Snivy", "Planta", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/snivy.png");
        this.setImagen(icon);

    }
}
