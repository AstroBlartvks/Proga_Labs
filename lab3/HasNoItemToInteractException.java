public class HasNoItemToInteractException extends RuntimeException {
    public HasNoItemToInteractException(String itemName){
        System.err.println("В инвентаре нет такого предмета: "+itemName);
    }
    @Override
    public String getMessage(){
        return "В инвентаре нет такого предмета!";
    }
}
