public class Problema1_EjecutorJuego {
    public static Personaje guerrero;
    public static Personaje mago;
    public static Personaje arquero;
    public static void main(String[] args) {
        
    }
    
}
abstract class Personaje{
    public int vidas, experiencia, batallasGanadas;
    public Personaje(int vidas) {
        this.vidas = vidas; }
    public abstract boolean ataque();
    public abstract int defensa();
    public String toString() {
        return "Personaje{" + "vidas=" + vidas + ", experiencia=" + experiencia + ", batallasGanadas=" + batallasGanadas + '}';}
}
class Guerrero extends Personaje{
    public String habilidades;
    public Guerrero(String habilidades, int vidas) {
        super(vidas);
        this.habilidades = habilidades; }
    public boolean ataque(){ 
        //return ( ((int) Math.random() * 2) == 1) ? true : false ;
        int numero = (int) Math.random() * 2;
        boolean gana = (numero == 1) ? true : false ;
        return gana; 
    }
    public int defensa() { return 0; }
    public String toString() {
        return "Guerrero{" + "habilidades=" + habilidades + "}   " + super.toString(); }
}
class Majo extends Personaje{
    public String estrategias;
    public Majo(String estrategias, int vidas) {
        super(vidas);
        this.estrategias = estrategias;   }
    public boolean ataque(){ return false; }
    public int defensa() { return 0; }
    public String toString() {
        return "Majo{" + "estrategias=" + estrategias + "}   " + super.toString(); }
    
}
class Arquero extends Personaje{
    public String atributos;
    public Arquero(String atributos, int vidas) {
        super(vidas);
        this.atributos = atributos;    }
    public boolean ataque(){ return false; }
    public int defensa() { return 0; }
    public String toString() {
        return "Arquero{" + "atributos=" + atributos + "}   " + super.toString(); }
}