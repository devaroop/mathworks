package com.mathworks;

/**
 * Created by devaroop on 27/8/14.
 */
public class BetweenXandYCalculator implements MathCalculator {
    private int lower_bound;
    private int upper_bound;

    public BetweenXandYCalculator(int x, int y){
        this.lower_bound = x;
        this.upper_bound = y;
    }
    public boolean verify(int number){
        if(number >= lower_bound && number <= upper_bound)
            return true;
        else
            return false;
    }
}
