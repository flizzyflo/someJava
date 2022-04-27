import java.lang.Math;  

class LessByTen {

	//returns true if the substraction each of the numbers is 10 or more

	boolean lessByTen(final int a, final int b, final int c) 
	{
		if (Math.abs(a - b) >= 10|| Math.abs(a - c) >= 10 || Math.abs(c - b) >= 10)
		{
			return true;
		}
		
		return false;
	}

}
