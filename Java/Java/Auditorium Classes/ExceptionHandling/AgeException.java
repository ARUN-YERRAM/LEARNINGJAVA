public class AgeException extends RuntimeException {
	@Override
	public String getMessage(){
		return "Age cannot be negative";
	}
}
