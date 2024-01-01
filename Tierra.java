

public class Tierra extends Pokemon {

    public Tierra(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp, int col, int row){
        super(nombre,"Tierra", ataque,vida,defensa,0,eqp, col, row);
    }
}

class Geodude extends Tierra {
    public Geodude(int ataque, int vida, int defensa, boolean eqp, int col, int row) {
        super("Geodude", "Tierra", ataque, vida, defensa, 0,eqp, col, row);
        image = getImage("/image/Geodude");
    }
    
}
class Rhyhorn extends Tierra{
    public Rhyhorn(int ataque, int vida, int defensa, boolean eqp, int col, int row) {
        super("Rhyhorn", "Tierra", ataque, vida, defensa, 0,eqp, col ,row);
        image = getImage("/image/Rhyhorn");
    }
    
}
