
class Euler 

{

	/**
	 * Berechnen Sie die Eulersche Zahl ( https://de.wikipedia.org/w/index.php?title=Eulersche_Zahl&oldid=198504762#Definition )
	 * aus den ersten k Elementen der definierenden Reihe.
	 
	*/

	Fakultaet facValue = new Fakultaet();
	double resultValue;

	double euler(final int k) {

		for (int i = 0; i < k; i++)
		{
			resultValue += ((double) 1 / (double) facValue.fakultaet(i));
		};
		
		return (double) resultValue;
				
		};


	}

