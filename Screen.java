import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

class Screen extends JFrame {
    public final int WIDTH = 700;
    public final int HEIGHT = 500;

    public Screen(ArrayList<Pokemon> equipo1 , ArrayList<Pokemon> equipo2) {
        ImageIcon originalIcon = new ImageIcon("Screen.jpg");
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(scaledIcon);

        JLabel interactiveLabel = new JLabel("Haz clic aquí para interactuar");
        interactiveLabel.setHorizontalAlignment(SwingConstants.CENTER);
        interactiveLabel.setForeground(Color.BLUE);
        interactiveLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        interactiveLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int result = JOptionPane.showConfirmDialog(Screen.this,
                        "¿Deseas cerrar esta pantalla y cargar el juego?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    dispose();

                    JFrame gameWindow = new JFrame("Tablero");
                    gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    gameWindow.setResizable(false);

                    GamePanel gamePanel = new GamePanel(equipo1,equipo2);
                    gameWindow.add(gamePanel);
                    gameWindow.pack();

                    gameWindow.setLocationRelativeTo(null);
                    gameWindow.setVisible(true);

                    gamePanel.launchGame();
                }
            }
        });

        setLayout(new BorderLayout());
        add(imageLabel, BorderLayout.CENTER);
        add(interactiveLabel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}