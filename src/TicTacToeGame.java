import java.util.Scanner;

public class TicTacToeGame implements TicTacToe
{
	private String[] board = new String[9];;
	
	public TicTacToeGame()
	{
		resetBoard();
	}
	
	public static void main(String[] args)
	{
		TicTacToeGame ttt = new TicTacToeGame();
		System.out.println(ttt.playGame("X", "O"));
	}

	/*
	 *  0 | 1 | 2
	 *  3 | 4 | 5
	 *  6 | 7 | 8
	 * 
	 *  0,1,2 | 0,3,6 | 0,4,8 | 1,4,7 | 2,4,6 | 2,5,8 | 3,4,5 | 6,7,8
	 *  
	 */
	
	@Override
	public boolean checkWin(String player) {
		if( board[0].equals(player) && board[1].equals(player) && board[2].equals(player) || 
			board[0].equals(player) && board[3].equals(player) && board[6].equals(player) ||
			board[0].equals(player) && board[4].equals(player) && board[8].equals(player) ||
			
			board[1].equals(player) && board[4].equals(player) && board[7].equals(player) ||
			
			board[2].equals(player) && board[4].equals(player) && board[6].equals(player) ||
			board[2].equals(player) && board[5].equals(player) && board[8].equals(player) ||
			
			board[3].equals(player) && board[4].equals(player) && board[5].equals(player) ||
			
			board[6].equals(player) && board[7].equals(player) && board[8].equals(player) 
		  )
			return true;
		return false;
	}

	@Override
	public void resetBoard() {
		for(int i=0;i<9;i++)
			board[i] = " ";
	}

	@Override
	public boolean checkValid(int n) {
		if(board[n].equals(" ")) 
			return true;
		return false;
	}

	@Override
	public boolean makeMove(String player, int n) {
		if(checkValid(n))
		{
			board[n] = player; 
			return true;
		}
			
		return false;
	}

	@Override
	public String toString() {
		String str = " ";
		for(int i=0;i<9;i++)
		{
			str += board[i] + " ";
			if(i!=8)
				if(i%3==2)
					str += "\n ------------- \n "; 
				else
					str += " | ";
		}
		return str;
		
	}

	@Override
	public String playGame(String playerA, String playerB) {
		Scanner scan = new Scanner(System.in);
		String turnPlayer = playerA;
		String input;
		boolean validInput;
		int turns = 0;
		int n = -1;
		
		while(turns != 8 && !checkWin(playerA) && !checkWin(playerB))
		{
			validInput = false;
			System.out.println(toString());
			do {
				System.out.println("Player " + turnPlayer + ", where would you like to go (1-9) >>> ");
				input = scan.next();
				try 
				{
					n = Integer.parseInt(input)-1;
					if(checkValid(n)) 
						validInput = true;
					else
					{
						System.out.println("Spot already taken! \nHit Enter to continue");
						scan.nextLine();
					}
					
				} 
				catch (Exception e) 
				{
					System.out.println("Invalid input! Please Try Again ... \nHit Enter to continue");
					scan.nextLine();
				}
				
			}while(!validInput);
			
			makeMove(turnPlayer,n);
			turns++;
			if(turns%2==0) 
				turnPlayer = playerA;
			else 
				turnPlayer = playerB;
		}
		System.out.println("\n\nGame Over! Final Board: ");
		System.out.println(toString()+"\n\n");
		if(checkWin(playerA)) return playerA;
		if(checkWin(playerB)) return playerB;
		return null;
	}
}
