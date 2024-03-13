import java.util.ArrayList;

public class Delimiters
{ 
    /** The open and close delimiters. */ 
    private String openDel; 
    private String closeDel; 

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     * close delimiter. 
     * Precondition: open and close are non-empty strings.
     */ 
    public Delimiters(String open, String close)
    { 
        openDel = open; 
        closeDel = close; 
    } 

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */ 
    public ArrayList<String> getDelimitersList(String[] tokens)
    { /* to be implemented in part (a) */ 
        ArrayList<String> list = new ArrayList<String>();
        for( int x = 0; x < tokens.length; x++ )
        {
            if( tokens[x].equals(openDel) || tokens[x].equals(closeDel))
            {
                list.add(tokens[x]);
            }
        }
        return list;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */ 
    public boolean isBalanced(ArrayList<String> delimiters) 
    { /* to be implemented in part (b) */ 
        int countOpen = 0;
        int countClose = 0;
        for( int x = 0; x < delimiters.size(); x++ )
        {
            if( delimiters.get(x).equals(openDel) )
            {
                if( countClose > countOpen )
                {
                    return false;
                }
                countOpen++;
            }
            else if( delimiters.get(x).equals(closeDel) )
            {
                countClose++;
            }
        }
        if( countOpen == countClose )
        {
            return true;
        }
        return false;
        
    }

    // There may be instance variables, constructors, and methods that are not shown. 

} 

