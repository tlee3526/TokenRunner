public class TokenRunner {
    public static void main (String [] args)
    {
        TokenPass game1 = new TokenPass();
        while (game1.gameOver()<0);
        {
            game1.printBoard();
            game1.distributeCurrentPlayerToken();
            game1.nextPlayer();
        }
        game1.printBoard();
        System.out.println("Game Winner: Player" + game1.gameOver());
    }
}
