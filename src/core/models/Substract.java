package core.models;


public class Substract extends Operation{

    public Substract(double number1, double number2) {
        super(number1, number2, "-");
    }

    @Override
    public double operate(){  
        return this.number1 - this.number2;
    }
}
