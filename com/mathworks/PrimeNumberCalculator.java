package com.mathworks;

/**
 * Created by devaroop on 27/8/14.
 */
public class PrimeNumberCalculator implements MathCalculator {
    public boolean verify(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
