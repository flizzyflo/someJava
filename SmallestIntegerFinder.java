
public class SmallestIntegerFinder{

    public static int findSmallestInt(int[] integerArray)
    {
        int minValue = integerArray[0];
        for (int i = 1; i < integerArray.length; i++)
            {
                if (minValue > integerArray[i])
                {
                    minValue = integerArray[i];
                }
            }
        
            return minValue;
    }

}