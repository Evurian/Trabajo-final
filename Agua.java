public class Agua extends Pokemon {

    public Agua(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp, int col, int row){
        super(nombre,"Agua", ataque,vida,defensa,0,eqp, col, row);
    }
}

class Squirtle extends Agua {
    public Squirtle(int ataque, int vida, int defensa, boolean eqp, int col, int row) {
        super("Squirtle", "Agua", ataque, vida, defensa, 0,eqp, col, row);
         image = getImage("/image/Squirtle");
    }
}
class Froakie extends Agua{
    public Froakie(int ataque, int vida, int defensa, boolean eqp, int col, int row) {
        super("Froakie", "Agua", ataque, vida, defensa, 0,eqp, col, row);
        image = getImage("/image/Froakie");
    }
}
