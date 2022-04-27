

class BMI {

	//BMI class, calculate BMI and prints the specific category string in german

	void calculateBmi(final double weightInKg, final double heightInMeters) 
	{	
		final double bmi = weightInKg/(heightInMeters * heightInMeters);
		System.out.println(bmi);
	}

	void findCategory(final double bmi) {


		if (bmi < 16)
		{
			System.out.println("Starkes Untergewicht");
		}
		
		else if (bmi < 16.9)
		{
			System.out.println("Mäßiges Untergewicht");
		}

		else if (bmi < 18.4)
		{
			System.out.println("Leichtes Untergewicht");
		}

		else if (bmi < 24.9)
		{
			System.out.println("Normalgewicht");
		}

		else if (bmi < 29.9)
		{
			System.out.println("Präadipositas");
		}

		else if (bmi < 34.9)
		{
			System.out.println("Adipositas Grad I");
		}

		else if (bmi < 39.9)
		{
			System.out.println("Adipositas Grad II");
		}

		else
		{
			System.out.println("Adipositas Grad III");
		}

	}

}
