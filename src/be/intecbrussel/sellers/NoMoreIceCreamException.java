package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends RuntimeException{
    public NoMoreIceCreamException() {
    }

    public NoMoreIceCreamException(String message) {
        super(message);
    }
}
