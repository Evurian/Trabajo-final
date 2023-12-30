import javax.swing.*;
public class Fuego extends Pokemon {

    public Fuego(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp){
        super(nombre,"Fuego", ataque,vida,defensa,0,eqp);
    }
}

class Charmander extends Fuego {
    public Charmander(int ataque, int vida, int defensa, boolean eqp) {
        super("Charmander", "Fuego", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/Charmander.png");
        this.setImagen(icon);
    }
    
}
class Chimchar extends Fuego{

    public Chimchar(int ataque, int vida, int defensa, boolean eqp) {
        super("Chimchar", "Fuego", ataque, vida, defensa, 0,eqp);
        ImageIcon icon = new ImageIcon("image/chimchar.png");
        this.setImagen(icon);
    }
}
