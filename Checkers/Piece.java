package Checkers;

public class Piece{
	
	//class attributes
	enum COLOR {RED,BLACK};
	private static int numberOfPieces =0;
	
	//instance attributes
	private COLOR color;
	private int id;
	
	public Piece(){
		id=numberOfPieces;
		numberOfPieces++;
	}
	
	public void set(Color c){
			color =c;
	}
	

}