package cse360assign2;

public class AddingMachine {
	
	private String history;
	private int total;
	
	public AddingMachine() {
		total = 0;
		history = "0 ";
	}
	
	/**
	 * Returns the current total of the AddingMachine
	 *
	 * @return      The total that the AddingMachine holds
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Adds 'value' to the total
	 *
	 * @param	value	Integer to be added to the total
	 */
	public void add(int value) {
		total += value;
		history += "+ " + value + " ";
	}
	
	/**
	 * Subtracts 'value' from the total
	 *
	 * @param  value	Integer to be subtracted from the total
	 */
	public void subtract(int value) {
		total -= value;
		history += "- " + value + " ";
	}
	
	/**
	 * Returns the current list of operations
	 *
	 * @return      The current list of operations the AddingMachine holds
	 */
	public String toString() {
		return history;
	}
	
	/**
	 * Clears the current list of operations and values that the AddingMachine holds
	 *
	 */
	public void clear() {
		history = "0 ";
		total = 0;
	}
}