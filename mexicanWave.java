import java.util.ArrayList;

public class mexicanWave {

    public static String[] wave(final String str) {

        ArrayList<String> resultList = new ArrayList <String>();
        String temp = new String();

        for (int i = 0; i < str.length(); i++){

            // if current letter is whitespace, it should be skipped since it can not be transformed into
            // upper case

            if (str.substring(i, i + 1).equals(" ")){
                continue;
            };

            for (int j = 0; j < str.length(); j++){
                
                // while iterating through the word, the whitespace needs to be added to the result
                if (str.substring(j, j + 1).equals(" ")){
                    temp += " ";
                }

                // switching case of the current letter if its the i-th iteration letter
                else if (j == i){
                    temp += str.substring(j, j + 1).toUpperCase();
                }
                else{
                    temp += str.substring(j, j + 1);
                };
              
            };

            resultList.add(temp);
            temp = "";

            };
            
            // turns result array list into stirng array as desired before returning it
            return resultList.toArray(new String[resultList.size()]);
        };

    }

