import javax.swing.ImageIcon;

public class Planta extends Pokemon {

    public Planta(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Planta", ataque,vida,defensa,0);
    }
}

class Bulbasaur extends Planta {
    private ImageIcon imagen = new ImageIcon(getClass().getResource("B.png"));
    public Bulbasaur(int ataque, int vida, int defensa) {
        super("Bulbasaur", "Planta", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
class Snivy extends Planta{
    private ImageIcon imagen = new ImageIcon(getClass().getResource("snivy.png"));
    public Snivy(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Snivy", "Planta", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
