package hu.me.advancedjava;

public class Representation
{
    private String[] args;

    public Representation(String[] args){

        this.args=args;
    }
    
    public static void printResult(int result)
    {

        System.out.println("osszeg" + result);
    }
    public Operands getOperands(){
      return new Operands(args[0],args[1]);

    }
}
