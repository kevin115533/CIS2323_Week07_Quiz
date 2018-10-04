package Checkers;

public class Piece{
	
	//class attributes
	private static int numberOfPieces =0;
	
	//instance attributes
	private Color color;
	private int id;
	
	public Piece(){
		id=numberOfPieces;
		numberOfPieces++;
	}
	
	public void set(Color c){
			color =c;
	}
	
	public Color getColor(){
		return color;
	}

}