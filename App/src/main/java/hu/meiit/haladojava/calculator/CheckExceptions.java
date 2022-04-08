package hu.meiit.haladojava.calculator;

import java.util.regex.Pattern;

public class CheckExceptions {

	public void checkDivideIsZero(double b) throws DivideWithZeroException {
		if (b == 0) {

			throw new DivideWithZeroException("-");
		}
		
	}
	
	public void checkInvalidCharacter(String input) throws InvalidCharachterException {
		if(Pattern.compile("[a-zA-Z]").matcher(input).matches()==true) {
			
			throw new InvalidCharachterException("-");
		}
	}
}
