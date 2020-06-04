package models;


public class GameBean {
	int[] board = new int[9];
	int move_num = 0;
	int current_player;
	
	int gamestate;
	
	public GameBean() {
		//initialize the board to -1
		for (int i=0; i<board.length;i++){
		  this.board[i] = -1;
		}
		
		this.current_player = 1;
		this.gamestate = 3;
	}
	/*
	 * Current player
	 * 
	 * 1 = X
	 * 0 = O
	 * 
	 */

	public void setMove(int move) {
		//if mark exists return -1
		if(this.board[move] == -1) {
			//mark given pos. with current player
			this.board[move] = current_player;
			// change current player
			this.current_player = 1 - current_player;
			//increment move number
			move_num += 1;
		}
	}
	/*  Gamestates
	 * 
	 *  0 - O won
	 *  1 - X won
	 *  2 - Draw
	 *  3 - still going
	 * 
	 *   |0|1|2|
	 *   |3|4|5|
	 *   |6|7|8|
	 */
	public int getGamestate() {
	//check game state and return

	//checking for O win
		//check rows
		if(board[0] == 0 && board[1] == 0 && board[2] == 0) {
			this.gamestate = 0;
			return this.gamestate;
		}
		if(board[3] == 0 && board[4] == 0 && board[5] == 0) {
			this.gamestate = 0;
			return this.gamestate;
		}
		if(board[6] == 0 && board[7] == 0 && board[8] == 0) {
			this.gamestate = 0;
			return this.gamestate;
		}
		//check column
		if(board[0] == 0 && board[3] == 0 && board[6] == 0) {
			this.gamestate = 0;
			return this.gamestate;
		}
		if(board[1] == 0 && board[4] == 0 && board[7] == 0) {
			this.gamestate = 0;
			return this.gamestate;
		}
		if(board[2] == 0 && board[5] == 0 && board[8] == 0) {
			this.gamestate = 0;
			return this.gamestate;
		}
		//check diagonal
		if(board[0] == 0 && board[4] == 0 && board[8] == 0) {
			this.gamestate = 0;
			return this.gamestate;
		}
		if(board[2] == 0 && board[4] == 0 && board[6] == 0) {
			this.gamestate = 0;
			return this.gamestate;
		}
	//checking for X win
		//check rows
		if(board[0] == 1 && board[1] == 1 && board[2] == 1) {
			this.gamestate = 1;
			return this.gamestate;
		}
		if(board[3] == 1 && board[4] == 1 && board[5] == 1) {
			this.gamestate = 1;
			return this.gamestate;
		}
		if(board[6] == 1 && board[7] == 1 && board[8] == 1) {
			this.gamestate = 1;
			return this.gamestate;
		}
		//check column
		if(board[0] == 1 && board[3] == 1 && board[6] == 1) {
			this.gamestate = 1;
			return this.gamestate;
		}
		if(board[1] == 1 && board[4] == 1 && board[7] == 1) {
			this.gamestate = 1;
			return this.gamestate;
		}
		if(board[2] == 1 && board[5] == 1 && board[8] == 1) {
			this.gamestate = 1;
			return this.gamestate;
		}
		//check diagonal
		if(board[0] == 1 && board[4] == 1 && board[8] == 1) {
			this.gamestate = 1;
			return this.gamestate;
		}
		if(board[2] == 1 && board[4] == 1 && board[6] == 1) {
			this.gamestate = 1;
			return this.gamestate;
		}
		
		//if any unmarked spots left return 3
		for(int i=0; i<board.length;i++) {
			if(this.board[i] == -1) {
				this.gamestate = 3;
				return this.gamestate;
			}
		}
		
		//all spots marked but no win, return draw
		this.gamestate = 2;
		return this.gamestate;

	}
	
	public void setGamestate(int gamestate) {
		this.gamestate = gamestate;
	}

	public int[] getBoard() {
		return board;
	}
	public void setBoard(int[] board) {
		this.board = board;
	}
	public String getCurrent_player() {
		if(current_player == 1) return "X";
		else return "O";
	}

}
