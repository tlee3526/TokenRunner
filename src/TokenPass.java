public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for (int x = 0;x < board.length;x++)
        {
            board [x] = (int)((Math.random()*10)+1);
        }
    }
    public void distributeCurrentPlayerTokens
    {
        
    }
}
