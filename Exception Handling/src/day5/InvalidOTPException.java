package day5;

public class InvalidOTPException extends Exception {

	private String message;

	InvalidOTPException(String message) {
		this.message=message;
	}


	@Override
	public String getMessage() {
		return message;
	}
}
