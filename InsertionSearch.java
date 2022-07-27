

public class InsertionSearch{

    static int[] resultArray;
    static int i, j;
    static int temp;

    public static void printArray(int[] printedArray)
    {

        System.out.print("[");
        for (int i : printedArray) 
        {
            System.out.print(i + ", ");
        }
        System.out.print("]\n");
        
    };

    public static void insertionSearch(int[] searchArray)
    {
        for (i = 1; i < searchArray.length; i++)
        {
            for (j = i; j > 0; j--)
            {
                if (searchArray[j - 1] > searchArray[j])
                {
                    temp = searchArray[j - 1];
                    searchArray[j - 1] = searchArray[j];
                    searchArray[j] = temp;
                }
                
                else
                {
                    break;
                };
            };

        };

    }

}

