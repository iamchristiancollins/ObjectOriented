package lab6;

public class Calculator {
    private int num1, num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add(){
        return this.getNum1() + this.getNum2();
    }

    public int subtract(){
        return this.getNum1() - this.getNum2();
    }

    public int mult(){
        return this.getNum1()*this.getNum1();
    }

    public double divide(){
        return (double) this.getNum1() / this.getNum2();
    }
}
