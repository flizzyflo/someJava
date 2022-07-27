import java.util.HashMap;


public class RowSumOddNumbers 
{
    

    public static int rowSumOddNumbers(int n)
    {
        int k = 1;
        
        HashMap<Integer, Integer> rows = new HashMap<Integer, Integer>();

        for (int totalRows = 1; totalRows <= n; totalRows++)
        {   
            int sum = 0;
            
            for (int rowLength = 1 ; rowLength <= totalRows; rowLength++ )
            {
                sum += k;
                k += 2;
            };

            rows.put(totalRows, sum);

        };
        return rows.get(n);
    }


};    

