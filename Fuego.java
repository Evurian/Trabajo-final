import javax.swing.*;
public class Fuego extends Pokemon {

    public Fuego(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Fuego", ataque,vida,defensa,0);
    }
}

class Charmander extends Fuego {
    public Charmander(int ataque, int vida, int defensa) {
        super("Charmander", "Fuego", ataque, vida, defensa, 0);
        this.setImagen(new ImageIcon(getClass().getResource("image/Charmander.png")));
    }
    
}
class Chimchar extends Fuego{

    public Chimchar(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Chimchar", "Fuego", ataque, vida, defensa, 0);
        this.setImagen(new ImageIcon(getClass().getResource("image/chimchar.png")));
    }
}
