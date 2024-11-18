import Exceptions.HasNoItemToInteractException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.Math.abs;
import static java.lang.Math.random;

public class Person extends Entity implements Popable, Containable, Swimable{
    Storage inventory = new Storage();
    List<Animal> pets = new ArrayList<>();
    boolean writeable = false;

    public Person(String name){
        this.stats = new EntityStats(name, EntityTypes.HUMAN);
    }

    public void think(String thoughts) {
        System.out.println(this.stats.getName() + " думает: "+thoughts);
    }
    public void wish(String wishes, double chance){
        System.out.println(this.stats.getName() + " желает: "+wishes);
        if (abs(random()) * 100 < chance){
            System.out.println("Желание выполнено");
        }else{
            System.out.println("Желание провалилось");
        }
    }
    public void useItem(Item item) throws HasNoItemToInteractException {
        if (inventory.exist(item.name)){
            throw new HasNoItemToInteractException(item.name);
        }
        item.use();
    }

    public void tame(Animal animal){
        pets.add(animal);
    }

    public boolean interact(String act, Item tool) throws HasNoItemToInteractException {
        if (inventory.exist(tool.name)){
            throw new HasNoItemToInteractException(tool.name);
        }
        if (tool.type == ItemTypes.NOTHING){
            System.out.println("Нет такого предмета: "+tool.name+", чтобы соверишть действие: "+act);
            return false;
        }
        tool.use();
        System.out.println(this.stats.getName()+" выпонил действие "+act+", используя "+tool.name);
        return true;
    }

    @Override
    public void voice() {
        System.out.println(this.stats.getName() + ": Привет!");
    }

    @Override
    public void append(String name, Item item) {
        this.inventory.append(name, item);
    }

    @Override
    public void appends(Item ... item) {
        for (Item i : item){
            this.inventory.append(i.name, i);
        }
    }

    @Override
    public Item randomPop() {
        String name = this.inventory.inventoryNames.get(0);
        this.inventory.inventoryNames.remove(name);
        Item item = this.inventory.get(name).clone();
        this.inventory.remove(name);
        return item;
    }

    @Override
    public Item pop(String name) {
        if (this.inventory.get(name) == null){
            return new Item(name, ItemTypes.NOTHING, 0);
        }
        Item item = this.inventory.get(name).clone();
        this.inventory.remove(name);
        return item;
    }

    @Override
    public void swim() {
        System.out.println("Человек \""+this.stats.getName()+"\" плывет!");
    }

    public boolean equals(Person human){
        if (!Objects.equals(human.stats.getName(), this.stats.getName())){
            return false;
        }
        if (!Objects.equals(human.stats.getType(), this.stats.getType())){
            return false;
        }
        if (human.inventory.hashCode() != this.inventory.hashCode()){
            return false;
        }
        if (human.pets.hashCode() != this.pets.hashCode()){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(inventory, pets, writeable, stats.getName(), stats.getType(), "HUMAN");
    }

    @Override
    public String toString() {
        return "Это человек с именем " + this.stats.getName();
    }
}