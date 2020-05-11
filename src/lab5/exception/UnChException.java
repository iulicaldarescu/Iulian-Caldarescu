package lab5.exception;

public class UnChException extends RuntimeException {
    public UnChException(String message){
        super("UnChException " + message);
    }
}
