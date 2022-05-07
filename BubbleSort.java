
public class BubbleSort 
{
    public static void bubbleSort(int[] array)
    {       
        //boolean keeps track of sort status of the array
        boolean sorted = false;

        //relevant to ensure that the array is run through its length times
        int maxWhileIteration = 0; 


        //main sorting loop
        while (sorted == false)
        //goes through the items within the list item per item 
        {
            for (int i = 0; i <= array.length - 1; i++)
            {
                if (i == array.length - 1)
                //reached the end of the array, leave the for loop
                {   
                    break;
                };


                if ((array[i] > array[i + 1]))
                //main sorting algorithm. compare item [i] with [i+1]. If next item is bigger, switch positions
                {   

                    int tempBiggerNumber = array[i];
                    int tempSmallerNumber = array[i + 1];

                    //switching of the bigger number with the smaller number. this is the sorting process
                    array[i + 1] = tempBiggerNumber;
                    array[i] = tempSmallerNumber;
                }
                else
                //if condition not true, start a new for loop
                {
                    continue;
                };

            };

            //helper variable to keep track of the iterations of the while loop
            maxWhileIteration ++;

            if (maxWhileIteration == array.length)
            //if the while loop was run legth times, the array is sorted. Sets boolean to true to end the while loop
            {
                sorted = true;
            };
        }
    }
}
