public class SimpleEncryption {

    public static String encrypt(final String text, final int n) {
        
        String resultString = text;
        String oddString = new String(); 
        String evenString = new String(); 
        int count = 0;
        

        if (n < 0 ||text == null)
        {
            return text;
        }
        
        while (count < n)
        {   
            for (int i = 0; i < text.length(); i++)
            {
                if (i % 2 != 0)
                {   
                    oddString += resultString.substring(i, i + 1);
                }
        
                if (i % 2 == 0)
                {
                    evenString += resultString.substring(i, i + 1);
                }

            }

            resultString = oddString + evenString;
            oddString ="";
            evenString = "";
            count ++;
        }
      
        return resultString;
    };
    
    public static String decrypt(final String encryptedText, final int n) 
    {   
        String resultString = encryptedText;
        int counter = 0; 
        int sumOddValues = ((encryptedText.length()) / 2);
        System.out.println(sumOddValues);
        if (n < 0 || encryptedText == null)
        {
            return encryptedText;
        }

        while (counter < n)
        {   
            String oddSubString = resultString.substring(0, sumOddValues + 1);
            String evenSubString = resultString.substring(sumOddValues);

            for (int i = 0; i < encryptedText.length(); i++)
            {
                if ((i % 2 == 0) && (i < evenSubString.length()))
                {   
                    resultString += evenSubString.substring(i, i + 1);
                }

                else if ((i % 2 != 0) && (i < oddSubString.length()))
                {
                    resultString += oddSubString.substring(i, i + 1);
                }
            }

            counter ++;
        }

        return resultString;
    };
 



    public static void main(String[] args)
    {   

        System.out.println(decrypt("This is a test!", 2));


    };
    
  }