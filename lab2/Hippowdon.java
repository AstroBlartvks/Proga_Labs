import ru.ifmo.se.pokemon.*;

public class Hippowdon extends Pokemon {
    public Hippowdon(String name, int level) {
        super(name, level);
        setStats(108, 112, 118, 68, 72, 47);
        setType(Type.FIGHTING);
        setMove(new Double_Edge(), new Bite(), new Crunch(), new Fire_Fang());
    }
}