public class Calculate 
{
    public static String bmi(final double weight, final double height) {
        
        final double bodyMassIndex = weight / Math.pow(height, 2);

        if (bodyMassIndex > 30)
        {
            return "Obese";
        }
        else if (bodyMassIndex > 25)
        {
            return "Overweight";
        }
        else if (bodyMassIndex > 18.5)
        {
            return "Normal";
        }
        else
        {
            return "Underweight";
        }
    }
}
