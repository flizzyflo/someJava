
public class CountSheeps {
    public static String countingSheep(int num) 
    {
        String resultString = new String();
        for (int i = 1; i <= num; i++)
        {
            resultString += i + " sheep...";
        }
    
        return resultString;
    }
}
