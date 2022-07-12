import java.util.HashMap;

public class CountingDuplicates {
    
    public static int duplicateCount(final String text) {
        
        // Initializing the result number variable. It will be incremented for every letter occuring more than one.
        int resultNumber = 0;
        int minTotalOccurence = 2;

        // main data structure for tracking the letters. maps char - int, increases the int for every occurence.
        HashMap<Character, Integer> resultMap = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length(); i++){
            // looping over every single letter of the text
            
            Character letter = text.toLowerCase().charAt(i);
           
            // if letter already in hashmap increment count by one
            if (resultMap.containsKey(letter)){
                resultMap.replace(letter, resultMap.get(letter), resultMap.get(letter) + 1);
            }
            // letter not in hashmap; insert and set count to 1
            else{
                resultMap.put(letter, 1);
            };

        };

        // check amout of letters occuring more than minimum of total occurence
        for(Character letter: resultMap.keySet()){
            if (resultMap.get(letter) >= minTotalOccurence){
                resultNumber ++;
            };
        }

        return resultNumber;
    };
    
}