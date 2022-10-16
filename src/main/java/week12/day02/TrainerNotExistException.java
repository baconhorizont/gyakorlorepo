package week12.day02;

public class TrainerNotExistException extends RuntimeException{
    public TrainerNotExistException(String message) {
        super(message);
    }

    public TrainerNotExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
