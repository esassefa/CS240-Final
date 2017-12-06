/**@author Elshaday Assefa
 
 * @version 1.0
 *
 * @param <T>
 */
import java.lang.Exception;
import java.lang.EmptyQueueException;

public class ArrayQueue<T> implements QueueInterface<T> {
	private T[] array;
	private int size = 0;
	private int front = 0;
	private int back = 0;
	public static final int DEFAULT_CAPACITY = 10;
	public static final int MAX_CAPACITY = 50;
	

	public ArrayQueue(){
		
		this(DEFAULT_CAPACITY);
		
	}
	
	public ArrayQueue(int initialCapacity) {
		if (initialCapacity < DEFAULT_CAPACITY) {
			initialCapacity = DEFAULT_CAPACITY;
		}
	}
	
	public void enqueue (T newEntry) {
	if(size == array.length){
		System.out.print( "Queue is full");
	}
	else {
		array[back] = newEntry;
	}
		back = (back + 1) % array.length;
		size++;
	
		
	}
	
	public T dequeue() {
		
		throws EmptyQueueException
		
		if (size == 0) 
			throw new EmptyQueueException();
		T newEntry = array[front];
		array[front] = null;
		front = (front + 1) % array.length;
		size--;
		return newEntry;

		
		
	}
	
	public T getFront() {
		throws EmptyQueueException
		
		if (size == 0) {
			throw new EmptyQueueException();
		}
		return array[size -1];
		
		
	}
	
	public boolean isEmpty() {
		
		return size == 0;
		
		
	}
	
	public void clear() {
		for(int i = 0; i< array.length; i++) {
			array[i] = null;
			
		}
	size = 0; 
		
	}
	
	
	

}

