package hu.meiit.haladojava.calculator;

public class  DivideWithZeroException extends Throwable {

	private static final long serialVersionUID = 1L;

	public DivideWithZeroException(String massage) {
		super(massage);
	}
}
