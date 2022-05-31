public class SaleHotdogs {
    public static int saleHotdogs(final int n){
        
        if (n < 5)
        {
            return n * 100;
        }

        else if (n >= 10)
        {
            return n * 90;
        }

        else
        {
            return n * 95;
        }

      }
}
