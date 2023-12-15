import java.util.*;
public class Run {
    public static final int numPokemon=2;

    public static void autoEquipo(ArrayList<Pokemon>equipo){
        int random;
        Pokemon parcial;
        for(int i=0;i<Run.numPokemon;i++){
            random=(int)(Math.random()*5)+1;
            switch (random) {
                case 1:
                    parcial=new Squirtle(1, 1, 1);
                    break;
                case 2:
                    parcial=new Charmander(1, 1, 1);
                    break;
                case 3:
                    parcial=new Pichu(1, 1, 1);
                    break;
                case 4:
                    parcial=new Geodude(1, 1, 1);
                    break;
                default:
                    parcial=new Bulbasaur(1, 1, 1);
                    break;
            }
            equipo.add(parcial);
        }
    }
    public static void mostrarEquipo(ArrayList<Pokemon>equipo){
        for(int i=0;i<equipo.size();i++){
            System.out.println("Nombre: "+equipo.get(i).getNombre()+"\tVida: "+equipo.get(i).getVida());
        }
    }
    public static void main(String[] args) {
        ArrayList<Pokemon>equipo1=new ArrayList<>();
        ArrayList<Pokemon>equipo2=new ArrayList<>();
        autoEquipo(equipo1);
        autoEquipo(equipo2);
        System.out.println("EQUIPO 1");
        mostrarEquipo(equipo1);
        System.out.println("EQUIPO 2");
        mostrarEquipo(equipo2);
    }    
}
