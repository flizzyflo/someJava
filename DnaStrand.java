
public class DnaStrand{

    public static String DnaChanger(String dna)
    {   
        
        char[] dnaArray = dna.toCharArray();
        String result = new String();

        for (char letter: dnaArray) 
        {
            result += ((letter == 'A') ? 'T' : (letter == 'C') ? 'G' : (letter == 'T') ? 'A' : 'C');
        }


        return result;
    }


}