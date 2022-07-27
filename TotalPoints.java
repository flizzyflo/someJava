
public class TotalPoints
{
    public static int points(String[] games)
    {
        
        int points = 0;

        for (String gameResult: games)
        {
         
            if (gameResult.charAt(0) > gameResult.charAt(2))
            {
                points += 3;
            }

            else if (gameResult.charAt(0) == gameResult.charAt(2))
            {
                
                points ++;
            }

            else
            {
                continue;
            }
        }

        return points;
    }

    public static void main(String[]args)
    {
        String[] liste = {"0:0","0:2","3:0"};
        System.out.println(points(liste));
    }

}