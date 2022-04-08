package hu.meiit.haladojava.calculator;

import java.io.IOException;
import java.util.Scanner;

public class ReadInputs {

	public String getInputs() throws IOException {
		try (Scanner input = new Scanner(System.in)) {
			String returnInputValue = input.nextLine();

			return returnInputValue;
		}
	}

}
