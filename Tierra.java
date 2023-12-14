public class Tierra extends Pokemon {

    public Tierra(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super("","Tierra", ataque,vida,defensa,0);
    }
}

class Geodude extends Tierra {

    public Geodude(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Geodude", "Tierra", ataque, vida, defensa, 0);
    }
}
class Rhyhorn extends Tierra{
    public Rhyhorn(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Rhyhorn", "Tierra", ataque, vida, defensa, 0);
    }
}
