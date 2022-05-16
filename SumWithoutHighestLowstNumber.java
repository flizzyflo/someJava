public class SumWithoutHighestLowstNumber {
    public static int sum(int[] numbers)
    {
        int minNumber = numbers[0];
        int maxNumber = numbers[0];
        int result = 0;

        if (numbers == null ||numbers.length <= 1)
        {
            return 0;
        }
        else if (numbers.length == 1)
        {
            return numbers[0];
        };


        for (int number: numbers)
        {
            if (number < minNumber)
            {minNumber = number;}

            else if (number > maxNumber)
            {
                maxNumber = number;
            };

            result += number;
        }

        
            return result - minNumber - maxNumber;
        
        }

    }
  

