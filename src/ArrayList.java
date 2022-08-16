/**
 * Michael Elder
 * CS131 Lab3
 * ArrayList<T> class creates the array and assigns the values in the array.
 */
import java.util.Arrays;

public class ArrayList<T> {
	
	private final int DEFAULT_SIZE = 10;
	private int currentItem = 0;
	private T arList [];
	
	/**
	 * Empty argument constructor
	 */
	public ArrayList(){
		arList=(T[]) new Object[DEFAULT_SIZE];
	}//end empty argument constructor
	/**
	 * Preferred constructor
	 * @param size
	 */
	public ArrayList(int size){
		arList=(T[]) new Object[size];
	}//end preferred constructor
	/**
	 * addItem method adds an item to the list. If it can, it returns true otherwise returns false.
	 * @param item
	 * @return
	 */
	public boolean addItem(T object) {
		if (currentItem<DEFAULT_SIZE) {
			arList[currentItem] = object;
			currentItem++;	
				return true;
			}//end if statement
			return false; 	
	}//end addItem method
	/**
	 * Getter for currentItem
	 * @return
	 */
	public int getCurrentItem() {
		return currentItem;
	}//end getCurrentItem
	/**
	 * Setter for currentItem
	 * @param currentItem
	 */
	public void setCurrentItem(int currentItem) {
		this.currentItem = currentItem;
	}//end setCurrentItem
	/**
	 * Getter for arList
	 * @return
	 */
	public T[] getArList() {
		return arList;
	}//end getArList
	/**
	 * Setter for arList
	 * @param arList
	 */
	public void setArList(T[] arList) {
		this.arList = arList;
	}//end setArList
	/**
	 * Getter for DEFAULT_SIZE
	 * @return
	 */
	public int getDEFAULT_SIZE() {
		return DEFAULT_SIZE;
	}//end getDEFAULT_SIZE
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", currentItem=" + currentItem + ", arList="
				+ Arrays.toString(arList);
	}//end toString
}//end class
