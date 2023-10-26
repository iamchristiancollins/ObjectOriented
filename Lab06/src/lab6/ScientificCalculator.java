package lab6;


public class ScientificCalculator extends Calculator {

    public ScientificCalculator(int num1, int num2){
        super(num1, num2);
    }

    public double sqrt(){
        return Math.sqrt((double) this.getNum1());
    }

    public double exponent(){
        return Math.pow(this.getNum1(), this.getNum2());
    }
}
