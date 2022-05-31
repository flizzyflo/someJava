public class Troll {
    public static String disemvowel(String str) {
        String vowelList [] = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (String vowel: vowelList)
        {
           str = str.replaceAll(vowel, "");
        };

        return str;
    }
}
