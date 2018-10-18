
public class TicTacToe_Blank implements TicTacToe
{
	private String[] board = new String[9];;
	
	public TicTacToe_Blank()
	{
		
	}
	
	public static void main(String[] args)
	{
		TicTacToe_Blank ttt = new TicTacToe_Blank();
		System.out.println(ttt.playGame("X", "O"));
	}

	/*
	 *  0 | 1 | 2
	 *  3 | 4 | 5
	 *  6 | 7 | 8
	 *  
	 */
	
	@Override
	public boolean checkWin(String player) {
		return false;
	}

	@Override
	public void resetBoard() {
		
	}

	@Override
	public boolean checkValid(int n) {
		
		return false;
	}

	@Override
	public boolean makeMove(String player, int n) {
		
		return false;
	}

	@Override
	public String toString() {
		
		return "";
		
	}

	@Override
	public String playGame(String playerA, String playerB) {
		
		return "";
	}
}
