public class BubblesortOddNumbers {
    public static int[] sortArray(int[] array) 
    {   
        int maxIteration = 0;
        boolean sorted = false;
        int counter = 1;

        while (sorted == false)
        {   
            counter= 1;
            
            for (int i = 0; i < array.length;)
            {   
                if (array[i] % 2 == 0)
                {
                    i++;
                    continue;
                };
                
                if (i + counter > array.length - 1)
                {
                    break;
                }

                if ((array[i + counter] % 2 == 0))
                {

                    counter++;
                    continue;
                };
                
                if (array[i] > array[i + counter])
                {
                    int higherNumber;
                    int lowerNumber;
                    lowerNumber = array[i + counter];
                    higherNumber = array[i];
                    array[i + counter] = higherNumber;
                    array[i] = lowerNumber;   
                };

                i ++;
                counter = 1;


            };

            maxIteration ++;

            if (maxIteration == array.length)
            {
                sorted = true;
            };

        }

        return array;
    }
}
