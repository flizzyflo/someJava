
class SumAvg {

	// class to calculate the sum and the average of a series of number each
	int sumResult;

	int calculateSum(final int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;

		};
		return sum;
	};
	
	double calculateAverage(final int n) 
	{
		for (int i = 1; i <= n; i++)
		{
			sumResult += i;
		}
		
		return ((double) (sumResult)/ (double) n);
	}

}
