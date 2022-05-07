public class Palindrome {
    
    protected boolean isPalindrome(String inputWord)
    {   
        String word = inputWord.toLowerCase();
        char startingLetterIndex = word.charAt(0);
        char finishingLetterIndex = word.charAt(word.length() - 1);

        if (word.length() <= 1)  //Basecase 1; Word has 0 or 1 letters -> always palindrom
        {
            return true;
        }
        
        if (word.length() == 2 && startingLetterIndex == finishingLetterIndex)  // Basecase 2; 2 letters left and are the same; palindrome
        {
            return true;
        }

        else  // word is longer than 2 letters
        {   

        if (startingLetterIndex == finishingLetterIndex)  //  move from left and right border of the word towards the center until it throws false
        {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
        
        return false;  
    }
};
}
