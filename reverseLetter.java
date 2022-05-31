public class reverseLetter {
    public static String reverseLetter(final String str) {
        
        String result = new String();

        for (int i = str.length() - 1; i >= 0; i--)
        {
            char literal = str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i))) 
            {
                result += str.charAt(i);
            }
        }

        return result;
    }
}
