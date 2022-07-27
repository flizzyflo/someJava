public class FindDivisor{

    public long numberOfDivisors(int number)
    {
        long counter = 0;

        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                counter ++;
            } 

        }

        return counter;

    }
}