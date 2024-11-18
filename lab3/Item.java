public class Item {
    private final String name;
    private final ItemTypes type;
    private int quantity;

    public Item(String name, ItemTypes type, int quantity){
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public ItemTypes getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public void use() throws QuantityIsZeroException {
        if(quantity == 0){
            throw new QuantityIsZeroException(this.name);
        }
        System.out.println("Был использован предмет: "+this.name);
        this.quantity--;

    }

    public Item clone() {
        return new Item(this.name, this.type, this.quantity);
    }
}
