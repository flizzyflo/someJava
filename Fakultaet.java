
class Fakultaet {

	//calculates the n! of a number
	
	long fakultaet(final int number) {
		
		if (number <= 1)
		{
			return 1;
		}

		else
		{
			return fakultaet(number - 1) * number;
		}
	}
};
