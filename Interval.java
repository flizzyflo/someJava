
import java.util.ArrayList;
import java.util.Arrays;

public class Interval {
    public static int sumIntervals(final int[][] intervals) {

        // checks for special cases like null values or empty arrays
        if (intervals == null) {
            return 0;
        }
        else if (intervals.length == 0) {
            return 0;
        }
        else if (intervals[0].length == 0) {
            return 0;
        };

        // create array list for storing values later on
        ArrayList<int[]> transformedList = new ArrayList<int[]>();
        
        // initialize counter for while loop
        int totalIterationCounter = 0;

        // sort array passed in by value to facilitate calculation
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // initialize values with list elements of first list
        int currLowVal = intervals[0][0];
        int currHighVal = intervals[0][1];

        // While true, it is not iterated over all lists in interval
        while (totalIterationCounter < intervals.length) {

            // iteration is over, write last values into transformedList array and break
            if (totalIterationCounter >= intervals.length - 1) {
                transformedList.add(new int[]{currLowVal, currHighVal});
                break;
            };

            // checks if the next array is within the current "range"
            if (currHighVal >= intervals[totalIterationCounter + 1][0]) {
                
                // increase current high value when the value of the next array is higher than current, since it is in range
                if (intervals[totalIterationCounter + 1][1] > currHighVal) {
                    currHighVal = intervals[totalIterationCounter + 1][1];
                };

                totalIterationCounter ++;
            }

            // next "starting" value is higher than current high value. means, the next array is not in range, a new "count" starts
            // therefore, writing current values into list and set values to those of the next array.
            else if (currHighVal < intervals[totalIterationCounter + 1][0]) {
                transformedList.add(new int[]{currLowVal, currHighVal});
                currLowVal = intervals[totalIterationCounter + 1][0];
                currHighVal = intervals[totalIterationCounter + 1][1];
                totalIterationCounter ++;
            };
        };
        return calculateResultSum(transformedList);
    };
    

    private static int calculateResultSum(final ArrayList<int[]> resultArray) {
        
        // helper function to calculate the final result sum

        int returnSum = 0;        

        for (int[] integerList: resultArray) {
            returnSum += (integerList[1] - integerList[0]);
        };

        return returnSum;

    };

}
