import java.util.Objects;

public class Cat extends Animal{

    public Cat(String name){
        this.stats = new EntityStats(name, EntityTypes.ANIMAL);
    }
    @Override
    public void voice() {
        System.out.println(this.stats.getName() + ": Мяу!");
    }

    @Override
    public int hashCode(){
        return Objects.hash(stats.getName(), stats.getType(), "CAT");
    }

    @Override
    public boolean equals(Animal animal) {
        {
            if (!Objects.equals(animal.stats.getName(), this.stats.getName())) {
                return false;
            }
            if (!Objects.equals(animal.stats.getType(), this.stats.getType())) {
                return false;
            }
            return true;
        }

    }
    @Override
    public String toString() {
        return "Это кошка с именем "+this.stats.getName();
    }
}
