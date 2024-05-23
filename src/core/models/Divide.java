package core.models;


public class Divide extends Operation{

    public Divide(double number1, double number2, String operator, double result) {
        super(number1, number2, operator, result);
    }

    @Override
    public double operate(){  
        return this.number1 / this.number2;
    }
    
}
