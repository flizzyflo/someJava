public class CountVowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++)
        {   
            if (vowels.contains(str.substring(i, i + 1)))
            {
                vowelsCount++;
            }
        }
        return vowelsCount;
      }
}
