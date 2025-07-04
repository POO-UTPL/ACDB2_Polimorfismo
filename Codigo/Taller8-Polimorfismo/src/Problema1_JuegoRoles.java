public class Problema1_JuegoRoles {
}
abstract class Personaje{
    public int vidas, experiencia, batallasGana;
    public abstract boolean ataque();
    public abstract int defensa();
}
class Guerrero extends Personaje{
    public String habilidades;
    public boolean ataque() { return false;} 
    public int defensa() { return 0;}
}
class Mago extends Personaje{
    public String estrategia;
    public boolean ataque() { return false;} 
    public int defensa() { return 0;}
}
class Arquero extends Personaje{
public String atributo;
    public boolean ataque() { return false;} 
    public int defensa() { return 0;}
}
