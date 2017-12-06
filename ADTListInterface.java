/** Interface for Abtract Data Sructure List
	@author Elshaday Assefa
	@version 1.0
*/

public interface ADTListInterface<T> {
	
	
	/** Adds new entry to end of the list
	list size is increased by one
	entries in list are unaffected 
	@param  the object to be added as an newEntry*/
	public void add(T newEntry);
	
	/** adds new entry at specified position within the list
	list size increased by one
	Entries initially at or above the specified position are at the next 
	higher position within the list
	@param position - integer with specified desired position for the new entry 
	@param newEntry - the object to be added as a new Entry */
	public void add(int position, T newEntry);
	
	/** removes entry at given position 
	Entries originally at positions higher than the given position 
	are at the next lower position within the list
	@param position- remove item in given specific position
	@returns item at given position
	@throws IndexOutOfBoundsException if given position < 1 or position > list.length
	list size is decreased by 1 */
	public T remove(int position);
	
	/** clear all entries in List, removes every entry */
	public void clear();
	
	/** isEmpty checks if List is empty 
	@returns true if L ist is empty and false if List is full
	*/
	public boolean isEmpty();
	
	/**  checks the entry at given position and returns it
	@returns entry at given position
	@throws IndexOutOfBoundsExeption if given position is < 1 or position > List.length
	*/
	public T getEntry(int position); 
	
	/** doubles capacity of array list of full
	no parameters and returns void
	*/
	private void ensureCapacity();
	
	
}