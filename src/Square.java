/**
 * Michael Elder
 * CS131 Lab3
 * Square class creates a different object to place into the array list
 */
public class Square {
	private double side;
	
	/**
	 * Empty argument constructor assigning side = 0
	 */
	public Square() {
		side = 0;
	}//end empty argument constructor
	/**
	 * Preferred constructor 
	 * @param s
	 */
	public Square(double s) {
		side = s;
	}//end preferred constructor
	/**
	 * getArea is returning side * side
	 * @return
	 */
	public double getArea() {
		return side * side; 
	}//end getArea
	/**
	 * Getter for side
	 * @return
	 */
	public double getSide() {
		return side;
	}//end getSide
	/**
	 * Setter for side
	 * @param side
	 */
	public void setSide(double side) {
		this.side = side;
	}//end setSide
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}//end toString
}//end class
