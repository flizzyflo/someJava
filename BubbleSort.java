
public class BubbleSort 
{
    public static void bubbleSort(int[] array)
    {       
        boolean sorted = false;
        int maxWhileIteration = 0; 

        while (sorted == false)
        {
            for (int i = 0; i <= array.length - 1; i++)
            {
                if (i == array.length - 1)
                {   
                    break;
                };

                if ((array[i] > array[i + 1]))
                {   
                    int tempIterable = array[i];
                    int tempSmallerNumber = array[i + 1];
                    array[i + 1] = tempIterable;
                    array[i] = tempSmallerNumber;
                }
                else
                {
                    continue;
                };

            };

            maxWhileIteration ++;

            if (maxWhileIteration == array.length)
            {
                sorted = true;
            };
        }
    }
}
