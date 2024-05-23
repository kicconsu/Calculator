package core.models;


public class Divide extends Operation{

    public Divide(double number1, double number2) {
        super(number1, number2, "/");
    }

    @Override
    public double operate(){  
        return this.number1 / this.number2;
    }
    
}
