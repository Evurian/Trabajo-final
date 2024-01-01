public class Electrico extends Pokemon {

    public Electrico(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp, int col, int row){
        super(nombre,"Electrico", ataque,vida,defensa,0,eqp, col, row);
    }
}

class Pichu extends Electrico {
    public Pichu(int ataque, int vida, int defensa, boolean eqp,int col, int row ) {
        super("Pichu", "Electrico", ataque, vida, defensa, 0,eqp, col, row);
         image = getImage("/image/Pichu");

    }
    
}
class Elekid extends Electrico{
    public Elekid(int ataque, int vida, int defensa, boolean eqp, int col, int row) {
        super("Elekid", "Electrico", ataque, vida, defensa, 0,eqp, col, row);
         image = getImage("/image/Elekid");

    }
    
}
