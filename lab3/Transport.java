import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport{
    public String title;
    List<Entity> entities = new ArrayList<>();

    public Transport(String title){
        this.title = title;
    }

    public abstract void sail();
    public void addEntity(Entity entity){
        entities.add(entity);
    }
    public void addEntity(Entity ... entity){
        entities.addAll(Arrays.asList(entity));
    }

    public void showEntities(){
        System.out.println("\nНа "+title+" такие сущности, как:");

        for (Entity e : this.entities){
            System.out.println(e.stats.getType().name + " с именем " + e.stats.getName());
        }
    }
}
