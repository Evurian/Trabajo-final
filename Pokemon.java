import javax.swing.ImageIcon;

class Pokemon{
    private String nombre, tipo;
    private int ataque, vida, defensa, exp;
    private ImageIcon imagen;
    private int fila, columna;
    
    
    public Pokemon(String nombre, String tipo, int ataque, int vida, int defensa, int exp) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.vida = vida;
        this.defensa = defensa;
        this.exp = exp;
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
    public void setFila(int n){
        fila = n;
    }
    public int getFila(){
        return fila;
    }
    public void setColumna(int n){
        columna = n;
    }
    public int getColumna(){
        return columna;
    }
    public void setImagen(ImageIcon n){
        imagen = n;
    }
    public ImageIcon getImagen(){
        return imagen;
    }
}