package Exceptions;

public class QuantityIsZeroException extends RuntimeException {
    public QuantityIsZeroException(String Object) {
        System.err.println("Количество "+Object+" равняется 0! Предмет нельзя использовать");
    }
    @Override
    public String getMessage(){
        return "Количество предметов равняется 0! Предмет нельзя использовать";
    }
}
