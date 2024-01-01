
public class Planta extends Pokemon {

    public Planta(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp, int col, int row){
        super(nombre,"Planta", ataque,vida,defensa,0,eqp, col,row);
    }
}

class Bulbasaur extends Planta {
    public Bulbasaur(int ataque, int vida, int defensa, boolean eqp,int col, int row) {
        super("Bulbasaur", "Planta", ataque, vida, defensa, 0,eqp,col,row);
        image = getImage("/image/B");
    }
    
}
class Snivy extends Planta{
    public Snivy(int ataque, int vida, int defensa, boolean eqp,int col, int row) {
        super("Snivy", "Planta", ataque, vida, defensa, 0,eqp,col , row);
        image = getImage("/image/Snivy");

    }
}
