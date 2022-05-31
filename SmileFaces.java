import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
  {
    int checkSum = 0;
    int totalCount = 0;
    
    for (String smiley: arr)
    {   

       
          if (smiley.equals(":D") ||smiley.equals(":)") || smiley.equals(":-D") || smiley.equals(":-)") || 
          smiley.equals(":~)") || smiley.equals(":~D"))
          {
            checkSum ++;
          };

          if (smiley.equals(";D") ||smiley.equals(";)") || smiley.equals(";-D") || smiley.equals(";-)") || 
          smiley.equals(";~)") || smiley.equals(";~D"))
          {
            checkSum ++;
          };


        

        if (checkSum > 0)
        {
            totalCount ++;
            checkSum = 0;
        };
    }

    return totalCount;
  }
    
}
  
}