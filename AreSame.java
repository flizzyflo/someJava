public class AreSame 
{
    public static boolean comp(int[] a, int[] b) 
    {
        boolean foundNumber = true;

        for (int i = 0; i < a.length; i++)
        {    
            for (int j = 0; j < b.length; j++)
            {
                if (Math.pow(a[i], 2) == b[j])
                {
                    foundNumber = true;
                    continue;
                }
                else if (Math.pow(a[i], 2) != b[j])
                {
                    foundNumber = false;
                }
                
            } 
        }


        return foundNumber;
    }

    public static void main(String[] args)
    {
        int [] ara = {1,3,5,7};
        int [] bra = {1,9,4,49};
        System.out.println(comp(ara, bra));
    }
} 
