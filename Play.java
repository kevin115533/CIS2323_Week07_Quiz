import Checkers.*;
import java.util.Scanner;

public class Play{
	public static void main(String[] args){
		//get board and pieces
		Board board = new Board();
		Piece r1 = new Piece();
		Piece b1 = new Piece();
		
		//setup board and pieces
		r1.set(Piece.Color.RED);
		b1.set(Piece.Color.BLACK);
		board.setPiece(b1,0,0);
		board.setPiece(r1,7,7);
		
		//check some stuff on the board
		System.out.println("Location 2x2 is occupied " + board.checkOcc(2,2));
		System.out.println("Location 7x7 is occupied " + board.checkOcc(7,7));
		
		
	}


}