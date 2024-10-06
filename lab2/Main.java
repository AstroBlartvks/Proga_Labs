import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon pa1 = new Throh("Каменный чувак", 1);
        Pokemon pa2 = new Hippopotas("Бегемот поменьше", 1);
        Pokemon pa3 = new Hippowdon("Бегемот побольше", 1);

        Pokemon pb1 = new Swinub("Свинка", 1);
        Pokemon pb2 = new Piloswine("Хряк", 1);
        Pokemon pb3 = new Mamoswine("Слоняра", 1);

        b.addAlly(pa1);
        b.addAlly(pa2);
        b.addAlly(pa3);

        b.addFoe(pb1);
        b.addFoe(pb2);
        b.addFoe(pb3);

        b.go();
    }
}