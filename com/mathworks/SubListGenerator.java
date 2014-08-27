package com.mathworks;

import java.util.ArrayList;

public class SubListGenerator {

    public ArrayList generate(ArrayList<Integer> testArray, MathCalculator strategy){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int num = 0; num < testArray.size(); num++){
            if(strategy.verify(testArray.get(num))){
                result.add(testArray.get(num));
            }
        }

        return result;
    }
}
