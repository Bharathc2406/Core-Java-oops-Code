package customexception;

public class InvaildPasswordException extends RuntimeException {


	private String message;

	InvaildPasswordException(String message) {
		this.message =message;
	}

	@Override
	public String getMessage() {
		return message; 
	}
}
//Unchecked -> class InvaildPasswordException extends RunTimeException{..}
//Checked -> class InvaildPasswordException extends Exception{..}