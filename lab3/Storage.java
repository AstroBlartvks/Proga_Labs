import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    HashMap<String, Item> inventory = new HashMap<>();
    List<String> inventoryNames = new ArrayList<>();

    public void show(){
        System.out.println("В хранилище находится: ");
        for (Map.Entry<String, Item> entry : this.inventory.entrySet()){
            String key = entry.getKey();
            Item item = entry.getValue();
            System.out.println("Предмет: " + key + ", В количестве: " + item.getQuantity());
        }
    }
    public boolean isEmpty(){
        return this.inventory.isEmpty();
    }
    public int amount(String name){
        return inventory.get(name).getQuantity();
    }
    public void append(String name, Item item){
        inventoryNames.add(name);
        inventory.put(name, item);
    }
    public Item get(String name){
        return inventory.get(name);
    }

    public boolean exist(String name){
        return inventory.get(name) != null;
    }

    public Item remove(String name){
        Item item = inventory.get(name).clone();
        inventory.remove(name);
        return item;
    }
}
