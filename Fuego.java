public class Fuego extends Pokemon {

    public Fuego(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp, int col, int row){
        super(nombre,"Fuego", ataque,vida,defensa,0,eqp, col, row);
    }
}

class Charmander extends Fuego {
    public Charmander(int ataque, int vida, int defensa, boolean eqp, int col, int row) {
        super("Charmander", "Fuego", ataque, vida, defensa, 0,eqp, col, row);
         image = getImage("/image/Charmander");
    }
}
class Chimchar extends Fuego{

    public Chimchar(int ataque, int vida, int defensa, boolean eqp, int col, int row) {
        super("Chimchar", "Fuego", ataque, vida, defensa, 0,eqp, col, row);
         image = getImage("/image/Chimchar");

    }
}
