/**
 * Michael Elder
 * CS131 Lab3
 * PointThreeD class creates a another object to place into the array list
 */
public class PointThreeD {
	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	/**
	 * Empty argument constructor
	 */
	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end empty argument constructor
	/**
	 * Preferred constructor
	 * @param x
	 * @param y
	 * @param z
	 */
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred constructor
	/**
	 * Getter for xPoint
	 * @return
	 */
	public double getxPoint() {
		return xPoint;
	}//end getxPoint
	/**
	 * Setter for xPoint
	 * @param xPoint
	 */
	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setxPoint
	/**
	 * Getter for yPoint
	 * @return
	 */
	public double getyPoint() {
		return yPoint;
	}//end getyPoint
	/**
	 * Setter for yPoint
	 * @param yPoint
	 */
	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}//end setyPoint
	/**
	 * Getter for zPoint
	 * @return
	 */
	public double getzPoint() {
		return zPoint;
	}//end getzPoint
	/**
	 * Setter for zPoint
	 * @param zPoint
	 */
	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}//end setzPoint
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
}//end class
