package co.com.demoblaze.exceptions;

public class CauseResultNotWaitedException extends AssertionError {

    private static final long serialVersionUID = 5727404813491910820L;

    public CauseResultNotWaitedException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
