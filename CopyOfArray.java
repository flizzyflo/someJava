import java.util.Arrays;

public class CopyOfArray {
    public static int[] take(int[] arr, int n) 
    {
        if (arr.length == 0)
            {
                return new int[0];
            };
          
        if (n > arr.length)
            {
                n = arr.length;
            };
          
          return Arrays.copyOfRange(arr, 0, n);
    }
        
}
