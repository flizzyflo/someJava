public class RockPaperScissor {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2))
        {
            return "Draw!";
        };

        String[] choices = {"scissors", "paper", "rock"};

        if ((p1.equals(choices[0]) && p2.equals(choices[1])) || (p1.equals(choices[1]) && p2.equals(choices[2])) || (p1.equals(choices[2]) && p2.equals(choices[0])))
        {
            return "Player 1 won!";
        }

        else
        {
            return "Player 2 won!";
        }

      }
}
