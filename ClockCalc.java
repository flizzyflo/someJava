public class ClockCalc {
    public static int Past(int h, int m, int s) 
  {
    int miliSec = 0;

    if (h > 23 || m > 59 || s > 59 || h <0 ||m<0 ||s<0)
    {
        return 0;
    };
    
    if (h > 0)
    {
        miliSec += h*60*60*1000;
    };

    if (m > 0)
    {
        miliSec += m*60*1000;
    };

    if (s > 0)
    {
        miliSec += s*1000;
    }

    return miliSec;
  }

  public static void main(String[] args)
  {
      System.out.println(Past(0, 1, 1));
  }
}
