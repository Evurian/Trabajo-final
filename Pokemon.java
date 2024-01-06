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
            if(Math.abs(targetCol - preCol) + Math.abs(targetRow - preRow) <= 20 || Math.abs(targetCol - preCol) * Math.abs(targetRow - preRow) <= 20){
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
    public int typeBenefit(Pokemon pokemon1, Pokemon pokemon2){
        String[]beneficio={"AF", "FP", "PA", "EA", "TF", "TE"};
        String[]perjuicio={"FA", "PF", "AP", "AE", "FT", "ET"};
        String key=pokemon1.getTipo().substring(0,1)+pokemon2.getTipo().substring(0,1);
        for(String k:beneficio){
            if(k.equals(key)){
                System.out.println("NOTIFICACION: VENTAJA DE TIPO AL INTENTAR ATACAR A "+pokemon2.getNombre());
                return 5;
            }
        }
        for(String k:perjuicio){
            if(k.equals(key)){
                System.out.println("NOTIFICACION: DESVENTAJA DE TIPO AL INTENTAR ATACAR A "+pokemon2.getNombre());
                return -5;
            }
        }
        return 0;
    }
    public boolean motionChecker(Pokemon pokemon1, Pokemon pokemon2){
        
        if((pokemon1.getVida()>pokemon2.getVida()&&(pokemon1.getAtaque()+typeBenefit(pokemon1, pokemon2)+3)>=pokemon2.getDefensa())||((pokemon1.getAtaque()+typeBenefit(pokemon1, pokemon2))>=pokemon2.getDefensa())){
            return true;
        }
        return false;
    }
    public boolean isVaildSquare(int targetCol,int targetRow){
        hittingP = getHittingP(targetCol, targetRow);
        if(hittingP == null){
            return true;
        } else{
            if(hittingP.equipo != this.equipo && motionChecker(this, hittingP)){
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