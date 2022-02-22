package hu.me.advancedjava;

public class Operands {
    public Operands(String s, String s1) {
        this.a= s;
        this.b=s1;
    }

    public Operands() {

    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    public void setB(String b) {
        this.b = b;
    }

    private  String a;

    public String getB() {
        return b;
    }


    private String b;

}
