// TicTacToe main project file, to be filled in by students.
//  Written by Miller Hollinger.

public class TicTacToe_Blank implements TicTacToe
{
	private String[] board = new String[9];
	
	public TicTacToe_Blank()
	{
		
	}
	
	public static void main(String[] args)
	{
		TicTacToe_Blank ttt = new TicTacToe_Blank();
		System.out.println(ttt.playGame("X", "O"));
	}
	
	@Override
	/* TODO : Returns true if the given player character has won with three-in-a-row.
	 * ------PARAMETERS------
	 * String player : The character to check for three-in-a-row.
	 * 		player.length() == 1
	 * ------RETURN VALUES------
	 * IF there are three characters equal to player in a row,
	 * 		RETURN true.
	 * ELSE
	 * 		RETURN false.
	 */
	public boolean checkWin(String player) {
		return false;
	}

	@Override
	/* TODO : Clears the board. Sets every space to " ".
	 */
	public void resetBoard() {
		
	}

	@Override
	/* TODO : Returns if the player is allowed to play on the given space.
	 * ------PARAMETERS------
	 * int n : The space where a character will be placed.
	 * 		n < board.length
	 * ------RETURN VALUES------
	 * IF the space at n is empty,
	 * 		RETURN true.
	 * ELSE
	 * 		RETURN false.
	 */
	public boolean checkValid(int n) {
		
		return false;
	}

	@Override
	/* TODO : Places the given charater in the given space if it is valid.
	 * USES: checkValid()
	 * ------PARAMETERS------
	 * String player : The character to place.
	 * 		player.length() == 1
	 * int n : The space to place player in.
	 * 		n < board.length
	 * ------RETURN VALUES------
	 * IF the play was valid,
	 * 		RETURN true.
	 * ELSE
	 * 		RETURN false.
	 */
	public boolean makeMove(String player, int n) {
		
		return false;
	}

	@Override
	/* TODO : A display function for the board.
	 * ------RETURN VALUES------
	 * RETURN the board in a 3x3 grid:
	 * 	0 | 1 | 2
	 *  3 | 4 | 5
	 *  6 | 7 | 8
	 *  
	 */
	public String toString() {
		
		return "";
		
	}

	@Override
	/* TODO : Plays a game of Tic-Tac-Toe.
	 * USES: All the functions in this file!
	 * ------PARAMETERS------
	 * String playerA : The character assigned to player one.
	 * 		playerA.length() == 1
	 * String playerB : The character assigned to player two.
	 * 		playerB.length() == 1
	 * ------RETURN VALUES------
	 * IF player one won the game,
	 * 		RETURN playerA.
	 * ELSE (player two won)
	 * 		RETURN playerB.
	 */
	public String playGame(String playerA, String playerB) {
		
		return "";
	}
}
