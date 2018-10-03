package Checkers;

public class Board{
	Piece[][] board = new Piece[8][8];
	
	public void setPiece(Piece P, int x, int y){
		board[x][y] = p;
	}

	public boolean checkOcc(int x, int y){
		return (board[x][y] =! null);
	}
}