package day5;

public class InvalidMarkException extends Exception{

	private String message;

	InvalidMarkException(String message) {
		this.message=message;
	}


	@Override
	public String getMessage() {
		return message;
	}
}
