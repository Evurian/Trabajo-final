import javax.swing.*;
public class Fuego extends Pokemon {

    public Fuego(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Fuego", ataque,vida,defensa,0);
    }
}

class Charmander extends Fuego {
    private ImageIcon imagen = new ImageIcon(getClass().getResource("image/Charmander.png"));
    public Charmander(int ataque, int vida, int defensa) {
        super("Charmander", "Fuego", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
class Chimchar extends Fuego{
    private ImageIcon imagen = new ImageIcon(getClass().getResource("image/chimchar.png"));

    public Chimchar(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Chimchar", "Fuego", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
