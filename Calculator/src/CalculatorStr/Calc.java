package CalculatorStr;

/**
 * Created by ADAM on 20.12.2016.
 */

import lib.CalculatorString;

public class Calc {

    private static CalculatorString calc           = new CalculatorString();

    public static void main (String[] args){
        System.out.println(calc.calculate("sin(5)+3*((145-10)+(2*(3+1)))-10-30"));
        //System.out.println(calc.calculate("0.3 - 0.2 + 0.1"));
    }
}

