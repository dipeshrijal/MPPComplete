package april2017.problem4;

@SuppressWarnings("serial")
public class IllegalWordException extends Exception {
	public IllegalWordException() {
		super();
	}
	public IllegalWordException(String msg) {
		super(msg);
	}
	public IllegalWordException(Throwable t) {
		super(t);
	}
}