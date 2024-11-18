public class Room implements Popable, Containable{
    private final String name;
    private Storage chest = new Storage();

    public Room(String name){
        this.name = name;
    }

    public Storage getStorage(){
        return this.chest;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void append(String name, Item item) {
        this.chest.append(name, item);
    }

    @Override
    public Item randomPop() {
        String name = this.chest.inventoryNames.get(0);
        this.chest.inventoryNames.remove(name);
        Item item = this.chest.get(name).clone();
        this.chest.remove(name);
        return item;
    }

    @Override
    public void appends(Item ... item) {
        for (Item i : item){
            this.chest.append(i.getName(), i);
        }
    }

    @Override
    public Item pop(String name) {
        Item item = this.chest.get(name).clone();
        this.chest.remove(name);
        return item;
    }
}
