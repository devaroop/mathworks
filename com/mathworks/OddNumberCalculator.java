package com.mathworks;

/**
 * Created by devaroop on 27/8/14.
 */
public class OddNumberCalculator implements MathCalculator {
    public boolean verify(int number) {
        if (number % 2 == 0)
            return false;
        else
            return true;
    }
}
