
class EuklidsAlgorithm {
	
	public static void main(String[] args) {
		EuklidsAlgorithm ggt = new EuklidsAlgorithm();
		ggt.calculateDivisior(0, 0);
	}
	
	//euklids algorithm to calculate the greates divider of two numbers
	
	public int calculateDivisior(int a, int b) {
		
		if (a==0)
		{
			return b;
		}
		else
		{
			while (b != 0)
			{
				if (a > b)
				{
					a = a - b;
				}
				else
				{
					b = b - a;
				}
			}
		return a;
		}
		
		
	}
}
