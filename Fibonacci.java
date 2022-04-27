
class Fibonacci {

	// prints out the fibonacci numbers
	void fibonacci(final int n) {
		for (int i = 1; i <= n; i++)
		{
			System.out.println(fibCalculator(i));
		}
	}

	// calculates the fibonacci numbers
	// without memoization
	
	int fibCalculator(final int n){
		if (n == 1)
		{
			return 1;
		}

		else if (n == 2)
		{
			return 1;
		}

		else
		{
			return fibCalculator(n - 1) + fibCalculator(n - 2);
		}
	}

}
