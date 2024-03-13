public class LightBoard
{
    /** The lights on the board, where true represents on and false represents off.
     */
    private boolean[][] lights;
    
    /** Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols)
    { /* to be implemented in part (a) */ 

        lights = new boolean[numRows][numCols];
    }
    
    /** Evaluates a light in row index row and column index col and returns a status
     * as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */
    public boolean evaluateLight(int row, int col)
    { /* to be implemented in part (b) */ 
        int lightOn = 0;
        for( int x = 0; x < lights.length-2; x++ )//what
        {
            if( lights[row][x] )
            {
                lightOn++;
            }
        }

        if( lights[row][col] )
        {
            if( lightOn % 2 == 0 )
            {
                return false;
            }
            return true;
        }

        if( ! lights[row][col] )
        {
            if( lightOn % 3 == 0 )
            {
                return true;
            }
            return false;
        }
        return lights[row][col];
    }
    
    // There may be additional instance variables, constructors, and methods not shown.

    //the following method is for testing only, do not use
    public void forceChange(boolean[][] l)
    { lights = l; }
} 

