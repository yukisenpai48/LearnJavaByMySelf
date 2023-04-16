package Exception;

public class InvalidAgeException extends Exception {
	private static final long serialVersionUID = -1785515545508772117L;

	public InvalidAgeException() {
		super("Invalid Age Exception");
	}

	public InvalidAgeException(String message) {
		super(message);
	}
}
