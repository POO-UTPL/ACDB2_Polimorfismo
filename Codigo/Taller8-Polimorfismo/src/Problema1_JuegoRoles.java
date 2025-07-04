public class Problema1_JuegoRoles {
}
abstract class Personaje{
    public int vidas, experiencia, batallasGana;
    public abstract boolean ataque();
    public abstract int defensa();
}
class Guerrero extends Personaje{}
class Mago extends Personaje{}
class Arquero extends Personaje{}
