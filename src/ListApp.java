
public class ListApp {

	public static void main(String[] args) {
		ArrayList <String> stringList = new ArrayList<String>();
		//Creating an array list of strings
		stringList.addItem("A");
		System.out.println(stringList.addItem("B"));
		stringList.addItem("B");
		stringList.addItem("C");
		stringList.addItem("D");
		stringList.addItem("E");
		stringList.addItem("F");
		stringList.addItem("G");
		stringList.addItem("H");
		stringList.addItem("I");
		stringList.addItem("J");
		stringList.addItem("K");
		System.out.println(stringList.addItem("L"));
		System.out.println((stringList));
		//Testing addItem method and printing out the toString
			ArrayList <Square> squareList = new ArrayList<Square>();
			//Creating an array list of square objects
			squareList.addItem(new Square(2.33));
			squareList.addItem(new Square(4.58));
			squareList.addItem(new Square(3.78));
			System.out.println(squareList.addItem(new Square(3.78)));
			squareList.addItem(new Square(2.098));
			squareList.addItem(new Square(7.823));
			squareList.addItem(new Square(5.93));
			squareList.addItem(new Square(1.97));
			squareList.addItem(new Square(8.96));
			squareList.addItem(new Square(9.19));
			System.out.println(squareList.addItem(new Square(1.77)));
			System.out.println((squareList));
			//Testing addItem method and printing out the toString
				ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();
				//Creating an array list of point three d objects
				pointList.addItem(new PointThreeD(2.3, 4.5, 1.5));
				pointList.addItem(new PointThreeD(1.9, 3.7, 2.4));
				pointList.addItem(new PointThreeD(2.3, 8.5, 6.5));
				pointList.addItem(new PointThreeD(5.7, 1.25, 3.7));
				System.out.println(pointList.addItem(new PointThreeD(4.2, 1.2, 4.6)));
				pointList.addItem(new PointThreeD(4.8, 2.6, 1.1));
				pointList.addItem(new PointThreeD(2.19, 7.71, 6.34));
				pointList.addItem(new PointThreeD(9.823, 4.479, 1.53));
				pointList.addItem(new PointThreeD(5.55, 6.66, 3.01));
				pointList.addItem(new PointThreeD(2.109, 3.25, 2.75));
				pointList.addItem(new PointThreeD(1.907, 4.198, 1.56));
				System.out.println(pointList.addItem(new PointThreeD(3.78, 9.01, 8.2)));
				System.out.println(pointList);
				//Testing addItem method and printing out the toString	
	}//end main
}//end class
