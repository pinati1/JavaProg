package test;

public class Number implements  Expression{

    private final double value;

    Number(double num){
        value= num;
    }

    @Override
    public double calculate(){
        return value;
    }



}
