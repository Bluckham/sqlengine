public class ParseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParseException(String message)
	{
		super(message);
	}

	public ParseException() {
		super("no message provided");
	}
	
}