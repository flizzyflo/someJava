
class AroundTen {
// return true if n has a max of 2 to 10 or a multiplication of 10

	 
	static boolean aroundTen(final int n) {
			
		if (n % 10 == 2 || n % 10 == 1 || n % 10 == 0 || n % 10 == 9 || n % 10 == 8)
		{
			return true;
		}

		else
		{
			return false;
		}

	}

}
