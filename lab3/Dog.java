import java.util.Objects;

public class Dog extends Animal implements Swimable{

    public Dog(String name){
        this.stats = new EntityStats(name, EntityTypes.ANIMAL);
    }
    @Override
    public void voice() {
        System.out.println(this.stats.getName() + ": Гав!");
    }

    @Override
    public int hashCode(){
        return Objects.hash(stats.getName(), stats.getType(), "DOG");
    }

    @Override
    public String toString() {
        return "Это собака с именем "+this.stats.getName();
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
    public void swim() {
        System.out.println("Собака \""+this.stats.getName()+"\" плывет!");
    }
}
