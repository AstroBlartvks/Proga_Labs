import ru.ifmo.se.pokemon.*;

public class Mamoswine extends Pokemon {
    public Mamoswine(String name, int level) {
        super(name, level);
        setStats(110, 130, 80, 70, 60, 80);
        setType(Type.GROUND, Type.ICE);
        setMove(new Swagger(), new Ice_Beam(), new Icy_Wind(), new Powder_Snow());
    }
}