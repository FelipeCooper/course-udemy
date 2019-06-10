package model.exception;

public class DomainExceptions extends RuntimeException{

	private static final long serialVersionUID = 5785659827843573580L;

	public DomainExceptions(String msg) {
		super(msg);
	}
}
