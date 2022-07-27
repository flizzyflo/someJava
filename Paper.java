
public class Paper{
    public static int paperWork(int numberClassmates, int pagesToCopy)
    {
        if (numberClassmates <= 0 || pagesToCopy <= 0)
        {
            return 0;
        }
        else{
            return numberClassmates*pagesToCopy;
        }
    }
}