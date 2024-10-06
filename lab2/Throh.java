import ru.ifmo.se.pokemon.*;

public class Throh extends Pokemon {
    public Throh(String name, int level) {
        super(name, level);
        setStats(120, 100, 85, 30, 85, 45);
        setType(Type.FIGHTING);
        setMove(new Focus_Blast(), new Swagger(), new Focus_Energy(), new Body_Slam());
    }
}