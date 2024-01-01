import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;

public class GamePanel extends JPanel implements Runnable{
    
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    final int FPS = 60;
    Thread gameThread;
    Board board = new Board();
    Mouse mouse = new Mouse();

    public static ArrayList<Pokemon> Pokemons = new ArrayList<>();
    public static ArrayList<Pokemon> simPokemons = new ArrayList<>();
    Pokemon activeP;

    public static final boolean WHITE = false;
    public static final boolean BLACK = true;
    boolean currentColor = WHITE;

    boolean canMove;
    boolean validSquare;


    public GamePanel(ArrayList<Pokemon> equipo1, ArrayList<Pokemon> equipo2){
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        addMouseListener(mouse);
        addMouseMotionListener(mouse);

        setPokemons(equipo1,equipo2);
        copyPokemons(Pokemons, simPokemons);
    }
    public void launchGame(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    public void setPokemons(ArrayList<Pokemon> equipo1, ArrayList<Pokemon> equipo2){
        for(Pokemon p: equipo1){
            Pokemons.add(p);
        }
        for(Pokemon p: equipo2){
            Pokemons.add(p);
        }
       
    }
    private void copyPokemons(ArrayList<Pokemon> source, ArrayList<Pokemon> target){
        target.clear();

        for(int i = 0; i < source.size(); i++){
            target.add(source.get(i));
        }
    }
    @Override
    public void run(){
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lasttime = System.nanoTime();
        long currentTime;

        while(gameThread != null){
            currentTime = System.nanoTime();

            delta+= (currentTime -lasttime)/drawInterval;
            lasttime = currentTime;

            if(delta >= 1){
                update();
                repaint();
                delta--;
            }
        }
    }

    private void update(){
        if(mouse.pressed){
            if(activeP == null){
                for(Pokemon p : simPokemons){
                    if(p.equipo == currentColor && p.col == mouse.x/Board.SQUARE_SIZE && p.row == mouse.y/Board.SQUARE_SIZE)
                        activeP = p;
                }
            }  else{
                simulate();
            }
        }
        if(mouse.pressed == false){
            if(activeP != null){
                if(validSquare){
                    copyPokemons(simPokemons, Pokemons);
                    activeP.updatePosition();       
                    changePlayer();         
                }else {
                    copyPokemons(Pokemons, simPokemons);
                    activeP.resetPosition();
                    activeP = null;
                }
            }
        } 
    }
    private void simulate() {
        canMove = false;
        validSquare = false;

        copyPokemons(Pokemons, simPokemons);
    
        activeP.x = mouse.x - Board.HALF_SQUARE_SIZE;
        activeP.y = mouse.y - Board.HALF_SQUARE_SIZE;
    
        activeP.col = activeP.getCol(activeP.x);
        activeP.row = activeP.getRow(activeP.y);
    
        if (activeP.canMove(activeP.col, activeP.row)) {
            canMove = true;

            if(activeP.hittingP != null){
                simPokemons.remove(activeP.hittingP.getIndex());
            }
            validSquare = true;
        }
    }
    public void changePlayer(){
        if(currentColor == WHITE){
            currentColor = BLACK;
        }else {
            currentColor = WHITE;
        }
        activeP = null;
    }
    
    public void paintComponent(Graphics a){
        super.paintComponent(a);

        Graphics2D a2 = (Graphics2D)a;
        board.draw(a2);

        for(Pokemon p: simPokemons){
            p.draw(a2); 
        }
        if(activeP != null){
            if(canMove){
                a2.setColor(Color.WHITE);
                a2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f));
                a2.fillRect(activeP.col*Board.SQUARE_SIZE, activeP.row*Board.SQUARE_SIZE, Board.SQUARE_SIZE, Board.SQUARE_SIZE);
                a2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
            }
            
            activeP.draw(a2);
        }
    }
    
}

class Mouse extends MouseAdapter {

    public int x, y;
    public boolean pressed;

    @Override
    public void mousePressed(MouseEvent e){
        pressed = true;
    }
    @Override
    public void mouseReleased(MouseEvent e){
        pressed = false;
    }
    @Override
    public void mouseDragged(MouseEvent e){
        x = e.getX();
        y = e.getY();
    }
    @Override
    public void mouseMoved(MouseEvent e){
        x = e.getX();
        y = e.getY();
    }
    
}
