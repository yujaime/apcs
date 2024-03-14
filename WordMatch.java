public class WordMatch 
{ 
    /** The secret string. */ 
    private String secret; 
    
    /** Constructs a WordMatch object with the given secret string of lowercase letters. */ 
    public WordMatch(String word) 
    { 
        secret = word;
    } 
    
    /** Returns a score for guess, as described in part (a). 
    * Precondition: 0 < guess.length() <= secret.length() 
    */ 
    public int scoreGuess(String guess) 
    { /* to be implemented in part (a) */ 
        int count = 0;
        for( int x = 0; x < secret.length()-guess.length()+1; x++ )
        {
            if( secret.substring(x, x + guess.length() ).equals(guess) )
            {
                count++;
            }
        }
        return count*guess.length()*guess.length(); // 19.5 mins wtf
    } 
    
    /** Returns the better of two guesses, as determined by scoreGuess and the rules for a 
    * tie-breaker that are described in part (b). 
    * Precondition: guess1 and guess2 contain all lowercase letters. 
    * guess1 is not the same as guess2. 
    */ 
    public String findBetterGuess(String guess1, String guess2) 
    { /* to be implemented in part (b) */ 
        int one = scoreGuess(guess1);
        int two = scoreGuess(guess2);

        if( one > two )
        {
            return guess1;
        }
        if( one < two )
        {
            return guess2;
        }
        else
        {
            if( guess1.compareTo(guess2) > 0 )
            {
                return guess1;
            }
            else
            {
                return guess2;
            }
        }
    } 
} 

