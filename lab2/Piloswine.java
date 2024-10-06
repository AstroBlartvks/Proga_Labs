import ru.ifmo.se.pokemon.*;

public class Piloswine extends Pokemon {
    public Piloswine(String name, int level) {
        super(name, level);
        setStats(100, 100, 80, 60, 60, 50);
        setType(Type.GROUND, Type.ICE);
        setMove(new Swagger(), new Ice_Beam(), new Icy_Wind());
    }
}