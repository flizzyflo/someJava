public class Lettercount {
    public static int strCount(String str, char letter) {
        int counter = 0;
        for (char literal: str.toCharArray())
        {
            if (literal == letter)
            {
                counter ++;
            }

        }

        return counter;
      }
}
