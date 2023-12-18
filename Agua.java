import javax.swing.*;
public class Agua extends Pokemon {

    public Agua(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Agua", ataque,vida,defensa,0);
    }
}

class Squirtle extends Agua {
    private ImageIcon imagen = new ImageIcon(getClass().getResource("image/squirtle.png"));
    public Squirtle(int ataque, int vida, int defensa) {
        super("Squirtle", "Agua", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
class Froakie extends Agua{
    private ImageIcon imagen = new ImageIcon(getClass().getResource("image/froakie.png"));
    public Froakie(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Froakie", "Agua", ataque, vida, defensa, 0);
    }
    public ImageIcon getImage(){
        return imagen;
    }
}
