
import java.util.NoSuchElementException;

public class StackLinkedArray<T> implements StackInterface<T> {

private Node<T> head;
private int data;


	private class Node<E> {
	private T item;
	private Node<E> next;
	}

	public StackLinkedArray() {
		
		head = null;
		data = 0;
	}
	
	public T pop() {
		if (head == null) {
			throw new NoSuchElementException("no such element");
		}
		T item = head.item;			// save item to return
		head = head.next;			// delete first node
		data--;
		return item;				// return saved item
		
	}
	
	public void push(T item) {			// add item to stack
		Node<T> prevHead = head;
		head = new Node<T>();
		head.item = item;
		head.next = prevHead;
		data++;
	
		
	}
	
	public T peek() {
		if (head == null) {
			throw new NoSuchElementException("no such element");
		}
		T temp = head.item;
		return temp;
		
	}
	public boolean isEmpty() {
		return head == null;
	}
	
	public void clear() {
		head = null;
		return;
	}

}