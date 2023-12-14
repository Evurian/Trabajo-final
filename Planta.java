public class Planta extends Pokemon {

    public Planta(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super("","Planta", ataque,vida,defensa,0);
    }
}

class Bulbasaur extends Planta {

    public Bulbasaur(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Bulbasaur", "Planta", ataque, vida, defensa, 0);
    }
}
class Snivy extends Planta{
    public Snivy(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Snivy", "Planta", ataque, vida, defensa, 0);
    }
}
