package hu.meiit.haladojava.calculator;

import java.io.IOException;

public class Selection {

	public Double getResult() throws IOException {
		Parse parse = new Parse();
		Service service = new Service();
		Double result = null;

		try {

			Operands op = parse.getParsedOperandsInputs();
			Double a = op.getA();
			Double b = op.getB();
			switch (op.getC()) {
			case "+":
				result = service.addition(a, b);
				break;
			case "-":
				result = service.subtraction(a, b);
				break;
			case "/":
				result = service.division(a, b);
				break;
			case "*":
				result = service.multiplication(a, b);
				break;
			default:
				System.out.println("-");
			}
		} catch (NullPointerException e) {
			
		}

		return result;

	}
}
