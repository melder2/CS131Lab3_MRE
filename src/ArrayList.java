import java.util.Arrays;

public class ArrayList<T> {
	
	private final int DEFAULT_SIZE = 10;
	private int currentItem = 0;
	private T arList [];
	
	public ArrayList(){
		arList=(T[]) new Object[DEFAULT_SIZE];
	}//end empty argument constructor
	public ArrayList(int size){
		arList=(T[]) new Object[size];
	}//end preferred constructor
	public boolean addItem(T size) {
		if (currentItem<DEFAULT_SIZE) {
			currentItem++;
			return true;
		}
			return false; 	
	}//end addItem method
	public int getCurrentItem() {
		return currentItem;
	}//end getCurrentItem
	public void setCurrentItem(int currentItem) {
		this.currentItem = currentItem;
	}//end setCurrentItem
	public T[] getArList() {
		return arList;
	}//end getArList
	public void setArList(T[] arList) {
		this.arList = arList;
	}//end setArList
	public int getDEFAULT_SIZE() {
		return DEFAULT_SIZE;
	}//end getDEFAULT_SIZE
	@Override
	public String toString() {
		return "ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", currentItem=" + currentItem + ", arList="
				+ Arrays.toString(arList);
	}//end toString
	
}//end class
