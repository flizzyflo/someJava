public class CharProblem 
{
    public static int howOld(final String herOld) {

        String[] resultList = herOld.split(" ");
        
        return Integer.decode(resultList[0]);
        }
}
