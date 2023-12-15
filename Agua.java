public class Agua extends Pokemon {

    public Agua(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super(nombre,"Agua", ataque,vida,defensa,0);
    }
}

class Squirtle extends Agua {

    public Squirtle(int ataque, int vida, int defensa) {
        super("Squirtle", "Agua", ataque, vida, defensa, 0);
    }
}
class Froakie extends Agua{
    public Froakie(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Froakie", "Agua", ataque, vida, defensa, 0);
    }
}
