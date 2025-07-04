public class Problema1_EjecutorJuego {
    
}
abstract class Personaje{
    public int vidas, experiencia, batallasGanadas;
    public abstract boolean ataque();
    public abstract int defensa();
}
class Guerrero extends Personaje{
    public String habilidades;
    public boolean ataque(){ 
        //return ( ((int) Math.random() * 2) == 1) ? true : false ;
        int numero = (int) Math.random() * 2;
        boolean gana = (numero == 1) ? true : false ;
        return gana; 
    }
    public int defensa() { return 0; }
}
class Majo extends Personaje{
    public String estrategias;
    public boolean ataque(){ return false; }
    public int defensa() { return 0; }
}
class Arquero extends Personaje{
    public String atributos;
    public boolean ataque(){ return false; }
    public int defensa() { return 0; }
}