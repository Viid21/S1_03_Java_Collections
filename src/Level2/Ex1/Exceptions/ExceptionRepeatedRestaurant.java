package Level2.Ex1.Exceptions;

public class ExceptionRepeatedRestaurant extends Exception {
    public ExceptionRepeatedRestaurant() {
        super("You'r not allowed to create two identical restaurants.");
    }
}
