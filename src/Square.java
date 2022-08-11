
public class Square {
	private double side;
	
	public Square() {
		side = 0;
	}//end empty argument constructor
	public Square(double s) {
		side = s;
	}//end preferred constructor
	public double getArea() {
		return side * side; 
	}//end getArea
	public double getSide() {
		return side;
	}//end getSide
	public void setSide(double side) {
		this.side = side;
	}//end setSide
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}//end toString
}//end class
