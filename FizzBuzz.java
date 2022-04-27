
class FizzBuzz 
{
	// FizzBuzz "game"
	void fizzBuzz(final int number) 
	{
		
		for (int i = 1; i <= number; i++)
		{	
			if (i % 15 == 0)
			{
				System.out.print("Fizz Buzz");
			}

			else if (i % 3 == 0)
			{
				System.out.print("Fizz");
			}
			
			else if (i % 5 == 0)
			{
				System.out.print("Buzz");
			}

			else
			{
				System.out.print(i);
			};
			
		if (i < number)
		{
			System.out.print(", ");
		};

		};
	}

}
