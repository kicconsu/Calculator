package core.models;


public class Potency extends Operation{

    public Potency(double number1, double number2) {
        super(number1, number2, "^");
    }

    @Override
    public double operate(){  
        return Math.pow(this.number1, this.number2);
    }
}
