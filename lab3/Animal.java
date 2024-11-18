
public abstract class Animal extends Entity{
    Person master;

    public void trust(Person human){
        human.tame(this);
        this.master = human;
    }

    public abstract boolean equals(Animal animal);
}
