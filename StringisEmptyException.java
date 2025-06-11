package Activities;

public class StringisEmptyException extends Exception {
	private String message;
	
	public StringisEmptyException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return "The error happens because:" + this.message;
	}
}
