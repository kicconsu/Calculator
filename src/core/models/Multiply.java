package core.models;


 public class Multiply extends Operation{

    public Multiply(double number1, double number2) {
        super(number1, number2, "*");
    }
    
    @Override
    public double operate(){  
        return this.number1 * this.number2;
    }
}
