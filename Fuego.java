public class Fuego extends Pokemon {

    public Fuego(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super("","Fuego", ataque,vida,defensa,0);
    }
}

class Charmander extends Fuego {

    public Charmander(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Charmander", "Fuego", ataque, vida, defensa, 0);
    }
}
class Chimchar extends Fuego{
    public Chimchar(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Chimchar", "Fuego", ataque, vida, defensa, 0);
    }
}
