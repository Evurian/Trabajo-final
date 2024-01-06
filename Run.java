import java.awt.Color;
import java.util.*;

import javax.swing.JFrame;
public class Run {

    public static final int numPokemon=1;
    public static final int maxAtq=10;
    public static final int maxDef=10;
    public static final int maxVid=10;
    public static int elegirOpcion(String[]listaOpciones){
        Scanner scan=new Scanner(System.in);
        int i;
        do{
            System.out.println("Eliga uno de los opciones a continuación, ingrese el número entre 1 y "+listaOpciones.length+" según corresponda:");
            for(int j=0;j<listaOpciones.length;j++){
                System.out.println((j+1)+". "+listaOpciones[j]);
            }
            i=scan.nextInt();
        }
        while(i<1||i>listaOpciones.length);
        return (i-1);
    }
    public static void autoEquipo(ArrayList<Pokemon>equipo, boolean eqp){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> posicionesEquipo1 = new ArrayList<>();
        ArrayList<Integer> posicionesEquipo2 = new ArrayList<>();
        
        for (int i = 0; i < 10 * 10; i++) {
            if (eqp) {
                posicionesEquipo1.add(i);
            } else {
                posicionesEquipo2.add(i);
            }
        }
        
        Collections.shuffle(posicionesEquipo1);
        Collections.shuffle(posicionesEquipo2);
        System.out.println("Elegir sistema de elección del equipo pokemón, ingrese 0 para automático y 1 para manual, de elegir manual debera elegir entre las opciones hasta llegar a los "+Run.numPokemon+" pokemones...");
        int control=scan.nextInt();
        int index = 0;
        int random, randomAtq, randomDef, randomVid;
        Pokemon parcial;
        
        ArrayList<Integer> posiciones;
        if (eqp) {
            posiciones = posicionesEquipo1;
        } else {
            posiciones = posicionesEquipo2;
        }

        String[]opciones={"Squirtle","Charmander","Pichu","Geodude","Bulbasaur","Froakie","Chimchar","Elekid","Rhyhorn","Snivy"};
        for(int i=0;i<Run.numPokemon;i++){
            if(control==0){
                random=(int)(Math.random()*10)+1;
            }
            else{

                random=elegirOpcion(opciones)+1;
            }
            randomAtq=(int)(Math.random()*Run.maxAtq)+1;
            randomDef=(int)(Math.random()*Run.maxDef)+1;
            randomVid=(int)(Math.random()*Run.maxVid)+1;
            int posicion = posiciones.get(index);
            int fila = posicion / 10;
            int columna = posicion % 10;
            switch (random) {
                case 1:
                    parcial=new Squirtle(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                case 2:
                    parcial=new Charmander(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                case 3:
                    parcial=new Pichu(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                case 4:
                    parcial=new Geodude(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                case 5:
                    parcial=new Bulbasaur(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                case 6:
                    parcial=new Froakie(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                case 7:
                    parcial=new Chimchar(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                case 8:
                    parcial=new Elekid(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                case 9:
                    parcial=new Rhyhorn(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
                default:
                    parcial=new Snivy(randomAtq, randomVid, randomDef,eqp, fila ,columna);
                    break;
            }
            if(parcial.equipo == true){
                parcial.setBorderColor(Color.RED);
            }else{
                parcial.setBorderColor(Color.BLUE);
            }
            
            equipo.add(parcial);
            index++;
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
        System.out.println("Es turno de elegir del jugador 1...");
        autoEquipo(equipo1, true);
        System.out.println("Es turno de elegir del jugador 2...");
        autoEquipo(equipo2, false);
        System.out.println("EQUIPO 1");
        mostrarEquipo(equipo1);
        System.out.println("EQUIPO 2");
        mostrarEquipo(equipo2);

        JFrame window = new JFrame("Tablero");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        GamePanel tablero = new GamePanel(equipo1,equipo2);
        window.add(tablero);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        tablero.launchGame();
    }    
}
