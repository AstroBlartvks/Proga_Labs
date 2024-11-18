import Exceptions.QuantityIsZeroException;

public class Item {
    String name;
    ItemTypes type;
    int quantity;

    public Item(String name, ItemTypes type, int quantity){
        this.name = name;
        this.type = type;
        this.quantity = quantity;
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
