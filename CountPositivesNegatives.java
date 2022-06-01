import java.lang.reflect.Array;
import java.util.Arrays;

public class CountPositivesNegatives {
    
    

    public static int[] countPositivesSumNegatives(int[] input)
    {   

        int positiveCounter = 0;
        int negativeSum = 0;

        if (input == null || input.length == 0)
        {   
            return new int[0];
        }
        
        for (int number: input)
        {

            if (number > 0)
            {
                positiveCounter ++;
                continue;
            }

            else if (number < 0)
            {
                negativeSum += number;
                continue;
            }
        }

        return new int[] {positiveCounter, negativeSum};
    }

}
