package hu.meiit.haladojava.calculator;

import java.io.IOException;
import java.text.DecimalFormat;

public class App {


	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("0.0");
		try {
			Selection selection = new Selection();
			System.out.println(df.format(selection.getResult()));
		} catch (IllegalArgumentException e){

		}
	}
}
