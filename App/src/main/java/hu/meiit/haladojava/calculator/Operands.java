package hu.meiit.haladojava.calculator;

public class Operands {
    private Double a;
    private Double b;
    private String c;
    public Operands() {
    	
    }
    public Operands(Double a, Double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    

    public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }
}
