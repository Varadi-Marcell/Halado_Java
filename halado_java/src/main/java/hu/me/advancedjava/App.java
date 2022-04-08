package hu.me.advancedjava;

import java.security.Provider;

/**
 * Hello world!
 */
public class App {

    private static Integer getInt(String str, int order) {
        Integer rv = null;
        try {
            rv = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.err.println(order + ". parameter nem jo");
        }
        return rv;
    }


    public static void main(String[] args) {

        Representation representation = new Representation(args);

        Operands operands = representation.getOperands();

        Integer a =getInt(operands.getA(),1);
        Integer b =getInt(operands.getB(),2);

        if (a != null && b != null) {
            representation.printResult(new service().calculate(a,b));
        }
    }
}
