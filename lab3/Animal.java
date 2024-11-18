
public abstract class Animal extends Entity{
    protected Person master;

    public void trust(Person human){
        human.tame(this);
        this.master = human;
    }

    public abstract boolean equals(Animal animal);
}
