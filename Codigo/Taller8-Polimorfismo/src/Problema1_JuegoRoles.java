public class Problema1_JuegoRoles {
    public static void main(String[] args) {
        
    }
}
abstract class Personaje{
    public int vidas, experiencia, batallasGana;
    public abstract boolean ataque(Personaje personaje);
    public abstract int defensa();
}
class Guerrero extends Personaje{
    public String habilidades;
    public boolean ataque(Personaje personaje) { 
        //return ((int) (Math.random() * 1) == 1) ? true : false;
        int bandera = (int) (Math.random() * 1);
        boolean gana = (bandera == 1) ? true : false;
        return gana;
    } 
    public int defensa() { return 0;}
}
class Mago extends Personaje{
    public String estrategia;
    public boolean ataque(Personaje personaje) { return false;} 
    public int defensa() { return 0;}
}
class Arquero extends Personaje{
public String atributo;
    public boolean ataque(Personaje personaje) { return false;} 
    public int defensa() { return 0;}
}
