import java.lang.Exception;


public class EmptyQueueException extends Exception {

	public EmptyQueueException() {
		super("The queue was empty.");
	}
	
	public EmptyQueueException(String message) {
		
		super(message);
	}
	
}
