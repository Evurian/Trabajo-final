import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Tablero extends JFrame {
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private ArrayList<Pokemon> ejercitoAzul;
    private ArrayList<Pokemon> ejercitoRojo;

    public Tablero(ArrayList<Pokemon> ejercitoAzul, ArrayList<Pokemon> ejercitoRojo) {
        this.ejercitoAzul = ejercitoAzul;
        this.ejercitoRojo = ejercitoRojo;

        setTitle("Mapa con Dos Ejércitos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(FILAS, COLUMNAS));

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                JPanel celda = new JPanel();
                celda.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                JLabel label = new JLabel();
                label.setHorizontalAlignment(SwingConstants.CENTER);

                Pokemon pokemon = obtenerPokemonTipo();

                if (pokemon != null && pokemon.getImagen() != null) {
                    label.setIcon(pokemon.getImagen());
                }

                celda.add(label);
                add(celda);
            }
        }

        setVisible(true);
    }

    private Pokemon obtenerPokemonEnPosicion(int fila, int columna) {
        
        return null; 
    }
    private Pokemon obtenerPokemonTipo() {
        Random random = new Random();

        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("Fuego");
        tipos.add("Agua");
        tipos.add("Tierra");
        tipos.add("Planta");
        tipos.add("Electrico");

        String tipoElegido = tipos.get(random.nextInt(tipos.size()));

        Pokemon pokemon = null;
        switch (tipoElegido) {
            case "Fuego":
                pokemon = new Charmander(7,7,5); 
                break;
            case "Agua":
                pokemon = new Squirtle(5,8,6); 
                break;
            case "Tierra":
                pokemon = new Geodude(5, 10, 15);
                break;
            case "Planta":
                pokemon = new Bulbasaur(4, 6, 7);
                break;
            case "Electrico":
                pokemon = new Pichu(3, 5, 3);
                break;
        }
        return pokemon;
    }
}
