import com.mathworks.BetweenXandYCalculator;
import com.mathworks.OddNumberCalculator;
import com.mathworks.PrimeNumberCalculator;
import com.mathworks.SubListGenerator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MathWorksProblemTest {

    @Test
    public void getPrimeNumbersTest() {
        //Given
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        //when
        SubListGenerator generator = new SubListGenerator();
        ArrayList<Integer> result = generator.generate(testArray, new PrimeNumberCalculator());
        //Then
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7, 11, 13));
        assertEquals(expected, result);
    }

    @Test
    public void getOddNumbersTest() {
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        //when
        SubListGenerator generator = new SubListGenerator();
        ArrayList<Integer> result = generator.generate(testArray, new OddNumberCalculator());
        //Then
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));
        assertEquals(expected, result);
    }

    @Test
    public void getOddPrimeNumbersTest(){
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        //when
        SubListGenerator generator = new SubListGenerator();
        ArrayList<Integer> odd_list = generator.generate(testArray, new OddNumberCalculator());
        ArrayList<Integer> odd_prime_list = generator.generate(odd_list, new PrimeNumberCalculator());
        //Then
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 11, 13));
        assertEquals(expected, odd_prime_list);
    }

    @Test
    public void getNumbersBetween1and5Test(){
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        //when
        SubListGenerator generator = new SubListGenerator();
        ArrayList<Integer> result = generator.generate(testArray, new BetweenXandYCalculator(5, 10));

        //Then
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9, 10));
        assertEquals(expected, result);
    }

    @Test
    public void getOddPrimesBetween2and31Test(){
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                    17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35));

        //when
        SubListGenerator generator = new SubListGenerator();
        ArrayList<Integer> between2And31 = generator.generate(testArray, new BetweenXandYCalculator(2, 31));
        ArrayList<Integer> odd_list = generator.generate(between2And31, new OddNumberCalculator());
        ArrayList<Integer> odd_prime_list = generator.generate(odd_list, new PrimeNumberCalculator());

        //Then
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 11, 13, 17, 19, 23, 29, 31));
        assertEquals(expected, odd_prime_list);
    }
}
