import javax.imageio.IIOException;

public class reversedSequence {
    public static int[] reverse(int n) throws IIOException
    {   
                
        int[] resultArray = new int[n];
        int idx = 0;
        for (int i = n; idx<n;i--)
        {
            resultArray[idx] = i;
            idx ++;
        }

        return resultArray;
    }
}
