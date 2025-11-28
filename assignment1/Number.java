package test;

public class Number implements  Expression{

    private final double value;

    Number(double num){
        value= num;
    }

    public double calculate(){
        return value;
    }

  

}
