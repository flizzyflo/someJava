public class CarRental 
{
    public static int rentalCarCost(int d) {
        
        int dailyRate = 40;

        if (d >= 3 && d < 7)
        {
            return (d * dailyRate) - 20;
        }

        else if (d >= 7)
        {
            return (d * dailyRate) - 50;
        }

        else
        {
            return d * dailyRate;
        }

    }
      
}
