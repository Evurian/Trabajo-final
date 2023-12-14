public class Electrico extends Pokemon {

    public Electrico(String nombre, String tipo, int ataque, int vida, int defensa, int exp){
        super("","Electrico", ataque,vida,defensa,0);
    }
}

class Pichu extends Electrico {

    public Pichu(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Pichu", "Electrico", ataque, vida, defensa, 0);
    }
}
class Elekid extends Electrico{
    public Elekid(String nombre, int ataque, int vida, int defensa, int exp) {
        super("Elekid", "Electrico", ataque, vida, defensa, 0);
    }
}
