public class Correct {
    public static String correct(String string) {

       return string.replaceAll("1", "I").replaceAll("0", "O").replaceAll("5", "S");

}


public static void main(String [] args)
{
    System.out.println(correct("1st D0ch 5cheiße"));
}
}
