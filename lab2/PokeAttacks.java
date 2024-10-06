import ru.ifmo.se.pokemon.*;

// Throh ='s attacks
class Focus_Blast extends SpecialMove{
    protected Focus_Blast(){
        super(Type.FIGHTING, 120, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "Имеет 10% шанс снизить Специальную защиту цели на одну ступень";
    }
}

class Swagger extends StatusMove{
    protected Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
    @Override
    protected String describe(){
        return "Повышает атаку цели на две ступени и сбивает ее с толку";
    }
}

class Focus_Energy extends SpecialMove{
    protected Focus_Energy(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        double offset_mul = 2.0;
        double speed = att.getStat(Stat.SPEED);
        speed = offset_mul * speed / 512;
        return speed;
    }

    @Override
    protected String describe(){
        return "Увеличивает шанс пользователя нанести критический удар";
    }
}

class Body_Slam extends PhysicalMove{
    protected Body_Slam(){
        super(Type.NORMAL, 85, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        return "Имеет 30% шанс парализовать цель";
    }
}

// Hippopotas's attacks

class Double_Edge extends PhysicalMove{
    protected Double_Edge(){
        super(Type.NORMAL, 120, 100);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        double recoil = damage * (1.0/3.0);
        att.setMod(Stat.HP, (int)Math.round(recoil));
    }
    @Override
    protected String describe(){
        return "Пользователь получает 1/3 урона, нанесенного отдачей";
    }
}

class Bite extends PhysicalMove{
    protected Bite(){
        super(Type.DARK, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "Имеет 30% шанс заставить цель вздрогнуть";
    }
}

class Crunch extends PhysicalMove{
    protected Crunch(){
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2){
            p.setMod(Stat.DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "Имеет 20% шанс понизить защиту цели на одну ступень";
    }
}

// Hippowdon's attacks

class Fire_Fang extends PhysicalMove{
    protected Fire_Fang(){
        super(Type.FIRE, 65, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1){
            Effect.flinch(p);
        }
        if (Math.random() <= 0.1){
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "Имеет 10% шанс поджечь цель и 10% шанс заставить цель вздрогнуть";
    }
}

// Swinub's attacks

class Ice_Beam extends SpecialMove{
    protected Ice_Beam(){
        super(Type.ICE, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1){
            Effect.freeze(p);
        }
    }
    @Override
    protected String describe(){
        return "Имеет 10% шанс заморозить цель";
    }
}

// Piloswine's attacks

class Icy_Wind extends SpecialMove{
    protected Icy_Wind(){
        super(Type.ICE, 55, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){
        return "Имеет 100% шанс снизить скорость цели на одну ступень";
    }
}

class Powder_Snow extends SpecialMove{
    protected Powder_Snow(){
        super(Type.ICE, 40, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1){
            Effect.freeze(p);
        }
    }
    @Override
    protected String describe(){
        return "Имеет 10% шанс заморозить цель";
    }
}