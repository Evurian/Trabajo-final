import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Tablero extends JFrame {
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;

    public Tablero(ArrayList<Pokemon> equipo,ArrayList<Pokemon> equipo2) {
        setTitle("Mapa con Dos Ejércitos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(FILAS, COLUMNAS));

        JPanel[][] celdas = new JPanel[FILAS][COLUMNAS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                celdas[i][j] = new JPanel();
                celdas[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                add(celdas[i][j]);
            }
        }

        ubicarPokemonsEnTablero(equipo, celdas,Color.RED);
        ubicarPokemonsEnTablero(equipo2, celdas, Color.BLUE);
        setVisible(true);
    }

    private void ubicarPokemonsEnTablero(ArrayList<Pokemon> equipo, JPanel[][] celdas,Color color) {
        ArrayList<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < FILAS * COLUMNAS; i++) {
            posiciones.add(i);
        }
        Collections.shuffle(posiciones);

        int index = 0;
        for (Pokemon pokemon : equipo) {
            int posicion = posiciones.get(index);
            int fila = posicion / COLUMNAS;
            int columna = posicion % COLUMNAS;

            pokemon.setFila(fila);
            pokemon.setColumna(columna);

            JLabel label = new JLabel(pokemon.getImagen());
            label.setHorizontalAlignment(SwingConstants.CENTER);
            celdas[fila][columna].setBorder(BorderFactory.createLineBorder(color));
            celdas[fila][columna].add(label);

            index++;
        }
    }
}
