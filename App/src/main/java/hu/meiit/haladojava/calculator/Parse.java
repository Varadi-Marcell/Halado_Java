package hu.meiit.haladojava.calculator;

import java.io.IOException;
import java.util.regex.Pattern;

public class Parse {

	private CheckExceptions ce = new CheckExceptions();
	private ReadInputs readInput = new ReadInputs();

	public Operands getParsedOperandsInputs() throws IOException, NullPointerException {
		String temp = deleteWhiteSpaces(readInput.getInputs());
		String operators[] = temp.split("[0.0-9.0]+");
		String operands[] = temp.split("[+-/*]");
		try {
			ce.checkInvalidCharacter(temp);
			ce.checkDivideIsZero(Double.parseDouble(operands[1]));
			return new Operands(Double.parseDouble(operands[0]), Double.parseDouble(operands[1]), operators[1]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("-");
		} catch (DivideWithZeroException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCharachterException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public String deleteWhiteSpaces(String input) {
		String noWhiteSpaceString = "";
		for (int i = 0; i < input.length(); i++) {
			if ((input.charAt(i) != ' ')) {
				noWhiteSpaceString = noWhiteSpaceString + input.charAt(i);
			}
		}
		return noWhiteSpaceString;
	}
}
