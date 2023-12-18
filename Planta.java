import javax.swing.ImageIcon;

public class Planta extends Pokemon {

    public Planta(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Planta", ataque,vida,defensa,0);
    }
}

class Bulbasaur extends Planta {
    private ImageIcon imagen = new ImageIcon(getClass().getResource("image/B.png"));
    public Bulbasaur(int ataque, int vida, int defensa) {
        super("Bulbasaur", "Planta", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
class Snivy extends Planta{
    private ImageIcon imagen = new ImageIcon(getClass().getResource("image/snivy.png"));
    public Snivy(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Snivy", "Planta", ataque, vida, defensa, 0);
    }
    public void setImage(ImageIcon imagen){
        this.imagen = imagen;
    }
}
