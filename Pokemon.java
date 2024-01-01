import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

class Pokemon{
    private String nombre, tipo;
    private int ataque, vida, defensa, exp;
    public boolean equipo;
    public Color borderColor;
    public BufferedImage image;
    public int x, y;
    public int col, row, preCol, preRow;
    public Pokemon hittingP;

    public Pokemon(String nombre, String tipo, int ataque, int vida, int defensa, int exp, boolean eqp, int col, int row) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.vida = vida;
        this.defensa = defensa;
        this.exp = exp;
        this.equipo = eqp;
        
        this.col = col;
        this.row = row;
        this.x = getX(col);
        this.y = getY(row);
    }
    public BufferedImage getImage(String imagePath){
        
        BufferedImage image = null;
        try{
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));

        }catch (Exception e) {
            e.printStackTrace();
        }
        return image;

    }
    public void setBorderColor(Color color) {
        this.borderColor = color;
    }
    private int getX(int col) {
        return col * Board.SQUARE_SIZE;
    }

    private int getY(int row) {
        return row * Board.SQUARE_SIZE;
    }

    public int getCol(int x) {
        return (x + Board.HALF_SQUARE_SIZE) / Board.SQUARE_SIZE;
    }

    public int getRow(int y) {
        return (y + Board.HALF_SQUARE_SIZE) / Board.SQUARE_SIZE;
    }

    public int getIndex() {
        for (int index = 0; index < GamePanel.simPokemons.size(); index++) {
            if (GamePanel.simPokemons.get(index) == this) {
                return index;
            }
        }
        return 0;
    }

    public void updatePosition() {
        x = getX(col);
        y = getY(row);
        preCol = getCol(x);
        preRow = getRow(y);
    }

    public void resetPosition() {
        col = preCol;
        row = preRow;
        x = getX(col);
        y = getY(row);
    }
    public boolean canMove(int targetCol, int targetRow){
        if(isWithinBoard(targetCol, targetRow)){
            if(Math.abs(targetCol - preCol) + Math.abs(targetRow - preRow) == 1 || Math.abs(targetCol - preCol) * Math.abs(targetRow - preRow) == 1){
                if(isVaildSquare(targetCol, targetRow)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isWithinBoard(int targetCol, int targetRow){
        if(targetCol >= 0 && targetCol <= 9 && targetRow >= 0 && targetRow <= 9){
            return true;
        }
        return false;
    }
    public Pokemon getHittingP(int targetCol,int targetRow){
        for(Pokemon p: GamePanel.simPokemons){
            if(p.col == targetCol && p.row == targetRow && p != this){
                return p;
            }
        }
        return null;
    }
    public boolean isVaildSquare(int targetCol,int targetRow){
        hittingP = getHittingP(targetCol, targetRow);
        if(hittingP == null){
            return true;
        } else{
            if(hittingP.equipo != this.equipo){
                return true;
            } else {
                hittingP = null;
            }
        }
    
        return false;
    }
    public void draw(Graphics2D g){
        g.setColor(borderColor);
        g.setStroke(new BasicStroke(3)); 
        g.drawRect(x, y, Board.SQUARE_SIZE, Board.SQUARE_SIZE);
        g.drawImage(image, x, y, Board.SQUARE_SIZE, Board.SQUARE_SIZE, null);
    }
    public void setNombre(String n){
        nombre = n;
    }
    public void setTipo(String n){
        tipo = n;
    }
    public String getTipo(){
        return tipo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setAtaque(int n) {
        ataque = n;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setVida(int n) {
        vida = n;
    }

    public int getVida() {
        return vida;
    }

    public void setDefensa(int n) {
        defensa = n;
    }

    public int getDefensa() {
        return defensa;
    }
    
    public void setEquipo(boolean eqp){
        equipo=eqp;
    }
    public boolean getEquipo(){
        return equipo;
    }
}