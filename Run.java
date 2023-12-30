import java.util.*;
public class Run {

    public static final int numPokemon=50;
    public static final int maxAtq=10;
    public static final int maxDef=10;
    public static final int maxVid=10;

    public static void autoEquipo(ArrayList<Pokemon>equipo, boolean eqp){
        int random, randomAtq, randomDef, randomVid;
        Pokemon parcial;
        for(int i=0;i<Run.numPokemon;i++){
            random=(int)(Math.random()*10)+1;
            randomAtq=(int)(Math.random()*Run.maxAtq)+1;
            randomDef=(int)(Math.random()*Run.maxDef)+1;
            randomVid=(int)(Math.random()*Run.maxVid)+1;
            
            switch (random) {
                case 1:
                    parcial=new Squirtle(randomAtq, randomVid, randomDef,eqp);
                    break;
                case 2:
                    parcial=new Charmander(randomAtq, randomVid, randomDef,eqp);
                    break;
                case 3:
                    parcial=new Pichu(randomAtq, randomVid, randomDef,eqp);
                    break;
                case 4:
                    parcial=new Geodude(randomAtq, randomVid, randomDef,eqp);
                    break;
                case 5:
                    parcial=new Bulbasaur(randomAtq, randomVid, randomDef,eqp);
                    break;
                case 6:
                    parcial=new Froakie(randomAtq, randomVid, randomDef,eqp);
                    break;
                case 7:
                    parcial=new Chimchar(randomAtq, randomVid, randomDef,eqp);
                    break;
                case 8:
                    parcial=new Elekid(randomAtq, randomVid, randomDef,eqp);
                    break;
                case 9:
                    parcial=new Rhyhorn(randomAtq, randomVid, randomDef,eqp);
                    break;
                default:
                    parcial=new Snivy(randomAtq, randomVid, randomDef,eqp);
                    break;
            }
            equipo.add(parcial);
        }
    }
    public static void mostrarEquipo(ArrayList<Pokemon>equipo){
        for(int i=0;i<equipo.size();i++){
            System.out.println("Nombre: "+equipo.get(i).getNombre()+"\tVida: "+equipo.get(i).getVida()+"\tAtaque: "+equipo.get(i).getAtaque()+"\tDefensa: "+equipo.get(i).getDefensa());
        }
    }
    public static void main(String[] args) {
        ArrayList<Pokemon>equipo1=new ArrayList<>();
        ArrayList<Pokemon>equipo2=new ArrayList<>();
        autoEquipo(equipo1, true);
        autoEquipo(equipo2, false);
        System.out.println("EQUIPO 1");
        mostrarEquipo(equipo1);
        System.out.println("EQUIPO 2");
        mostrarEquipo(equipo2);
        Tablero tablero = new Tablero(equipo1,equipo2);
        tablero.setVisible(true);
    }    
}
