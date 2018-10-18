
public interface TicTacToe 
{	
	//Return true if player x is winning board
	public boolean checkWin(String player);
	
	//Reset the board game
	public void resetBoard();
	
	//Check if move is valid, ie. if player can place a O or X on n square
	public boolean checkValid(int n);
	
	//Check if move is valid and Make move
	public boolean makeMove(String player, int n);
	
	//Print board
	public String toString();
	
	//Play Game
	public String playGame(String playerA, String playerB);	
}
