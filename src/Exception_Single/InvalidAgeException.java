package Exception_Single;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}
