import ru.ifmo.se.pokemon.*;

public class Swinub extends Pokemon {
    public Swinub(String name, int level) {
        super(name, level);
        setStats(50, 50, 40, 30, 30, 50);
        setType(Type.GROUND, Type.ICE);
        setMove(new Swagger(), new Ice_Beam());
    }
}