package Location;

public class GoToSameLocationException extends RuntimeException {
    public GoToSameLocationException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
